package com.javapractice;

public class MTest2 {

	public static void main(String[] args) {
		System.out.println("Main method started");
		M1();
		
	}
	public static void M1() {
		System.out.println("Static method 1 called");
		M2();
	}
	public static void M2() {
		System.out.println("Static method 2 called");
		MTest2 t = new MTest2();
		t.M3();
	}
	void M3() {
		System.out.println("Instance method 1 called ");
		M4();
	}
	void M4() {
		System.out.println("Instance method 2 called ");
		M5();
			}
	public static void M5() {
		System.out.println("Static Method 3 called");
	}
	

}
