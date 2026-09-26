package com.Abstraction;

public class Bus implements Vehicle{

	@Override
	public void start() {
		System.out.println("Bus starts at 4am");
	}

	@Override
	public void stop() {
		System.out.println("Bus stops at 11pm");
	}

}
