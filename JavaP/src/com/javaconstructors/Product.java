package com.javaconstructors;

public class Product {
	int productId;
	String productName;
	int price;
	
	Product(int productId, String productName, int price){
		this.productId = productId;
		this.productName = productName;
		this.price= price;
	}

	public static void main(String[] args) {
		
		Product p = new Product(1,"sugar",25);
		p.show();
		Product p2 = new Product(2,"salt",18);
		p2.show();

	}
	void show() {
		System.out.println("Product id : "+productId);
		System.out.println("Product Name : " +productName);
		System.out.println("Product Price : "+price);
	}


}
