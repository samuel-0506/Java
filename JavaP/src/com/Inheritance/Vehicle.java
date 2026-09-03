package com.Inheritance;

public class Vehicle {
	int speed = 50;
	public int display() {
		return speed;
	}
}

class Car extends Vehicle {
	int speed = 100;
	public int display() {
		
		return speed;
	}

	public static void main(String[] args) {
		Vehicle v = new Car();
		int speed=v.display();
		System.out.println(speed);
	}

}

