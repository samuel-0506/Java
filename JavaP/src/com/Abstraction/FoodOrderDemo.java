package com.Abstraction;

public class FoodOrderDemo {

	public static void main(String[] args) {
		FoodOrder p = new PizzaOrder();
		System.out.println("Pizza Order");
		p.finalBill();
		System.out.println();
		FoodOrder b = new BurgerOrder();
		System.out.println("Burger Order");
		b.finalBill();
		System.out.println();
		FoodOrder bi = new BiryaniOrder();
		System.out.println("Biryani Order");
		bi.finalBill();

	}

}
