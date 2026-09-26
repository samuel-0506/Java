package com.Abstraction;

class PizzaOrder extends FoodOrder {
	
	@Override
	double calculateBill() {
		return 200;
	}

	@Override
	public double deliveryCharge() {
		return 30;
	}

}
