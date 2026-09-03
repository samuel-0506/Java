package com.Inheritance;

class Vehicle2{
	String brand;
	int speed;
	void displayVehicle() {
		System.out.println("Brand : "+brand);
		System.out.println("Speed : "+speed);
	}
}
class Car2 extends Vehicle2{
	String model;
	int noOfDoors;
	void displayCar() {
		System.out.println("Model "+model);
		System.out.println("No of Doors : "+noOfDoors);
	}
}
class Bike extends Vehicle2{
	String model;
	boolean hasGears;
	void displayBike() {
		System.out.println("Model "+model);
		System.out.println("No of Doors : "+hasGears);
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		Car2 c = new Car2();
		c.brand="BMW";
		c.model="BMW-56";
		c.speed=390;
		c.noOfDoors=2;
		
		Bike b = new Bike();
		b.brand="Enfield";
		b.model="Classic 350";
		b.speed=360;
		
		c.displayVehicle();
		c.displayCar();
		System.out.println("****************");
		b.displayVehicle();
		b.displayBike();

	}

}
