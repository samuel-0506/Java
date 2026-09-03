package com.Inheritance;
class Animal{
	
	void sound() {
		System.out.println("Animals makes sounds");
	}
}
class Dog extends Animal{
	void sound() {
		System.out.println("Dog Barks");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Animal s = new Dog();
		s.sound();

	}

}
