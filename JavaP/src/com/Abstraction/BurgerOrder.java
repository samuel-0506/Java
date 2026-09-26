package com.Abstraction;

class BurgerOrder extends FoodOrder {

	@Override
	double calculateBill() {
		return 160;
	}

	@Override
	public double deliveryCharge() {
		return 25;
	}
}
