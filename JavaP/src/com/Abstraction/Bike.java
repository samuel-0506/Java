package com.Abstraction;

public class Bike implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bike starts at 10pm");
	}

	@Override
	public void stop() {
		System.out.println("Bike stops at 12pm");
	}

}
