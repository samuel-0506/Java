package com.Encapsulation;

public class ProductInventory {
	private int productId;
	private String productName;
	private int price;
	private double quantity;
	

	public ProductInventory(int productId, String productName, int price, double quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	void addStock(int amount) {
		if(amount>0) {
			quantity=quantity+amount;
		}
	}
}