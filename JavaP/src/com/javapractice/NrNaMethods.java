package com.javapractice;

import java.util.Scanner;

public class NrNaMethods {
	static Scanner sc = new Scanner(System.in);
	String name, branch, clgname;
	int age;
	int sum, remainder;

	void m1() {
		System.out.println("Hello, Java!");
	}

	void m2() {
		System.out.println("Enter name : ");
		name = sc.nextLine();
		System.out.println("Enter age : ");
		age = sc.nextInt();
		System.out.println("Enter branch : ");
		sc.nextLine();
		branch = sc.nextLine();

	}

	void m3() {
		System.out.println("Enter college name : ");
		clgname = sc.nextLine();
	}

	void m4() {
		System.out.println("Enter value one : ");
		int a = sc.nextInt();
		System.out.println("Enter value two : ");
		int b = sc.nextInt();
		sum = a + b;
	}

	void m5() {
		System.out.println("Enter value one : ");
		int a = sc.nextInt();
		System.out.println("Enter value two : ");
		int b = sc.nextInt();
		remainder = a % b;
	}

	void display() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(branch);
		System.out.println(clgname);
		System.out.println("Sum of two values : " + sum);
		System.out.println("Remainder of two values : " + remainder);
	}

	public static void main(String[] args) {
		NrNaMethods m = new NrNaMethods();
		m.m1();
		m.m2();
		m.m3();
		m.m4();
		m.m5();
		m.display();

	}

}
