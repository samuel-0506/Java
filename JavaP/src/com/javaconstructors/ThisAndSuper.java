package com.javaconstructors;

class vehicle{
	String brand;
	String model;
	double price;
	double MPLitre;
}

class Bike extends vehicle{
	String brand = "Ninja";
	String model="ZX-10R";
	double price=35000000.0;
	double MPLitre=18;
	{
		
	}
	
	void show() {
		System.out.println("Bike Brand : " + this.brand);
		System.out.println("Bike Model : " + this.model);
		System.out.println("Bike Price : " + this.price);
		System.out.println("Bike MP Litre : " + this.MPLitre);
	
	}
}

public class ThisAndSuper {

	public static void main(String[] args) {
		Bike b = new Bike();
		b.show();
			}
}

