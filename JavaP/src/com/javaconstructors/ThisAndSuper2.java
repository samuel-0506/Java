package com.javaconstructors;

class Human {
	String name = "Samuel";
	int age = 23;
	String dob = "06-09-2004";
}

class Person extends Human {
	String name;
	int age;
	String dob;

	Person(String name, int age, String dob) {
		super();
		this.name= "Lavanya";
		this.age = 22;
		this.dob = "03-06-2005";
	}

	void show() {
		System.out.println("*******By using this********");
		System.out.println("Name : " + name);
		System.out.println("Name : " + age);
		System.out.println("Name : " + dob);

		System.out.println("*******By using Super********");
		System.out.println("Name : " + super.name);
		System.out.println("Name : " + super.age);
		System.out.println("Name : " + super.dob);

	}

}

public class ThisAndSuper2 {

	public static void main(String[] args) {
		Person p = new Person(null, 0, null);
		p.show();

	}

}
