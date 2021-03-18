package src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Produto> list = new ArrayList<>();
		
		System.out.println("digite o endereço do arquivo: ");
		String endereco = sc.nextLine(); // c://temp//dados.txt
		
		File arquivoFonte = new File(endereco);
		String pastaFonteStr = arquivoFonte.getParent();
		// boolean succes = new File(pastaFonteStr + "\\out").mkdir();
		String arquivoCriado = pastaFonteStr + "\\\\out\\\\summary.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(endereco))){
			
			String dados = br.readLine();
			while (dados != null) {
				String [] campos = dados.split(",");
				String name = campos[0];
				Double price = Double.parseDouble(campos[1]);
				int quantity = Integer.parseInt(campos[2]);
				list.add(new Produto(name, price, quantity));
				dados = br.readLine();
			}
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivoCriado))){
				for (Produto pr : list) {
					bw.write( pr.getNameProduct()+ "," +String.format("%.2f", pr.finalPrice()));
					bw.newLine();
				}
				System.out.println("o arquivo foi criado");
			}
		
		catch (IOException e) {
			System.out.println("erro: " + e.getMessage());
		}	}
		catch (IOException  e){	
			System.out.println("erro: " + e.getMessage());
	}
		sc.close();

	}
}

