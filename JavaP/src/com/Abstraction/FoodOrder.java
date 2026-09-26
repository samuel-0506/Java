package com.Abstraction;

abstract class FoodOrder {
	abstract double calculateBill();
	abstract double deliveryCharge();
	
	
	void finalBill() {
		double bill=calculateBill();
		double delCharges = deliveryCharge();
		System.out.println("Food Bill : "+bill);
		System.out.println("Delivery Charges : "+delCharges);
		System.out.println("Total Bill : "+(bill+delCharges));
	}
}
