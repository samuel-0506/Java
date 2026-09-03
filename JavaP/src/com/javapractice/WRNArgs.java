package com.javapractice;

import java.util.Scanner;

public class WRNArgs {
	static Scanner sc = new Scanner(System.in);

	int age() {  
		int a = 22;
		return a;
	}

	String ddetails() {
		String sname = sc.nextLine();
		return sname;
	}

	int sum() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = a + b;
		return sum;
	}

	int details() {
		return 'A';
	}

	char details2() {
		return 65;
	}

	double rectArea() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		double area = a * b;
		return area;
	}
	char lastChar() {
		sc.nextLine();
		String name = sc.nextLine();
		return name.charAt(name.length() - 1);
	}

	public static void main(String[] args) {
		WRNArgs s = new WRNArgs();
		System.out.println("Name : " + s.ddetails());
		System.out.println("Age : " + s.age());
		System.out.println("Sum of two Nums : " + s.sum());
		System.out.println("Aschii values of A : " + s.details());
		System.out.println("Aschii values of 65 : " + s.details2());
		System.out.println("Area of Reactangle : " + s.rectArea());
		System.out.println("Last char of String : "+ s.lastChar());
	}

}
