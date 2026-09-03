package com.javaconstructors;

public class Experiments {
	String name;
	int age;

	Experiments(String name, int age) {
		this.name = name;
		this.age = age;
	}
	void Experiments(String name,int age) {
		this.name=name;
		this.age = age;
		System.out.println(name);
		System.out.println(age);
	}

	public static void main(String[] args) {
		Experiments e = new Experiments("Samuel", 22);
		e.show();
		e.show2();
		e.Experiments(null, 0);
		

	}

	void show() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

	void show2() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
		return;		
	}

}
