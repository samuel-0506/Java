package com.Abstraction;

class BiryaniOrder extends FoodOrder{
	
	@Override
	double calculateBill() {
		return 390;
	}

	@Override
	public double deliveryCharge() {
		return 35;
	}
}
