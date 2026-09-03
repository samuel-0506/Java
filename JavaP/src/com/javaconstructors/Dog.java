package com.javaconstructors;

class Animal {
	Animal() {
		System.out.println("This is Animal Call ");
	}
}

class Mammal extends Animal {
	String type;
	Mammal(String type) {
		super();
		System.out.println("This is Mammal Class extends from Animal Class ");
		this.type=type;

	}
}

public class Dog extends Mammal {
	String dogName;
	String breed;
	Dog(String dogName,String breed){
		super("Dog");
		System.out.println("This class extends from mammal class");
		this.dogName=dogName;
		this.breed=breed;
	}

	public static void main(String[] args) {
		Dog d = new Dog("Thor","Husky");
		d.show();

	}
	void show() {
		System.out.println("Mammal Type : " +type);
		System.out.println("Dog Name : "+ dogName);
		System.out.println("Dog Breed : "+breed);
	}

}
