package com.Abstraction;

class TestVehicle {

	public static void main(String[] args) {
		Vehicle c = new Car();
		System.out.println("***********Car Info*************");
		c.start();
		c.stop();
		System.out.println("***********Bike Info*************");
		Vehicle b = new Bike();
		b.start();
		b.stop();
		System.out.println("***********Bus Info*************");
		Vehicle bs = new Bus();
		bs.start();
		bs.stop();
	}

}
