


package com.Encapsulation;

import java.util.Arrays;

public class ShoppingCart2 {
	private Product [] cartItems=new Product[5];
	private int itemCount=0;
//	private double totalAmount;
	
	void addItem(Product s) {
	    cartItems[itemCount] = s;
	    itemCount++;
	}
	void removeItem(Product s) {
		for(int i=0;i<cartItems.length;i++) {
		if(cartItems[i]==cartItems[1]) {
			cartItems[i]=null;
		}
		}
	}
	

	public static void main(String[] args) {
		Product p=new Product("Santoor",50,8);
		Product p1=new Product("Mysore",99,2);
		Product p2=new Product("Lux",48,2);
		Product p3=new Product("Dove",29,2);
		ShoppingCart2 s = new ShoppingCart2();
		s.addItem(p);
		s.addItem(p1);
		s.addItem(p2);
		s.addItem(p3);
		s.removeItem(p);
		
//		for(Product x : s.cartItems) {
//		    if(x != null) {
//		        System.out.println(x.getItemName());
//		        System.out.println(x.getPrice());
//		        System.out.println(x.getQuantity());
//		        
//		    }
//		}
		System.out.println(Arrays.toString(s.cartItems));
		
	}

}
