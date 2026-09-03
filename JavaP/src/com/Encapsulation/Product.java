
package com.Encapsulation;

public class Product {
	private String itemName;
	private int price;
	private double quantity;
	
	public Product(String itemName,int price,int quantity) {
		this.itemName=itemName;
		this.price=price;
		this.quantity=quantity;
	}

//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public double getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(double quantity) {
//		this.quantity = quantity;
//	}
//
//	public String getItemName() {
//		return itemName;
//	}
//
//	public void setItemName(String itemName) {
//		this.itemName = itemName;
//	}

	@Override
	public String toString() {
		return "Product [itemName=" + itemName + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
	
		
}
