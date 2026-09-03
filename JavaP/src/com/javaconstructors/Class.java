package com.javaconstructors;

import java.util.Scanner;

public class Class {
	int id;
	String name;
	int age;

	Class(int id, String name, int age) {
		this.id =id;
		this.name=name;
		this.age=age;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter ID : ");
		int id=sc.nextInt();
		System.out.println("Enter Name : ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		Class c = new Class(id,name,age);
		c.show();

	}

	void show() {
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}

}
