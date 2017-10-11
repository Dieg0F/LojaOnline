package br.edu.univas.si4.tp4.lojaonline.model;

public class Product {

	private String name;
	private int quantity;
	
	
	
	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", quantity=" + quantity + "]";
	}
	
	
}
