package com.javapractice;

public class ShoppingCart {
	
	void addItem (String itemName,int quantity ){
		System.out.println("Item Name : " + itemName);
		System.out.println("Quantity : " + quantity);
	}

	public static void main(String[] args) {
		ShoppingCart sc = new ShoppingCart();
		sc.addItem("sugar", 3);

	}

}
