package com.javaconstructors;

public class Car {
	String brand;
	String model;
	int price;

	Car(String brand, String model, int price) {
		this.brand = brand;
		this.model = model;
		this.price = price;

	}

	public static void main(String[] args) {
		Car c = new Car("BMW", "B-42", 15000);
		c.display();

	}

	void display() {
		System.out.println("Car Brand : " + brand);
		System.out.println("Car Model : "+model);
		System.out.println("Car Price : "+price);

	}

}
