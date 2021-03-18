package entities;

public class Produto {
	
	private String nameProduct;
	private Double priceProduct;
	private int quantity;
	
	public Produto () {
		
	}

	public Produto(String nameProduct, Double priceProduct, int quantity) {
		this.nameProduct = nameProduct;
		this.priceProduct = priceProduct;
		this.quantity = quantity;
	}

	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}

	public Double getPriceProduct() {
		return priceProduct;
	}

	public void setPriceProduct(Double priceProduct) {
		this.priceProduct = priceProduct;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public Double finalPrice () {
		return priceProduct * quantity;
	}
	
}
