package com.javaconstructors;

public class Chaining1 {
	int age;
	String name;

	Chaining1() {
		this(22, "Samuel");
	}

	Chaining1(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Chaining1 c = new Chaining1();
		c.show();

	}
	void show() {
		System.out.println("Age : "+age);
		System.out.println("Name : "+ name);
	}

}
