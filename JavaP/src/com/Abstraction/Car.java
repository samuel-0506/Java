package com.Abstraction;

class Car implements Vehicle{

	@Override
	public void start() {
		System.out.println("Car Starts at 5pm");
	}
	@Override
	public void stop() {
		System.out.println("Car stops at 10pm");
	}
	
	
}
