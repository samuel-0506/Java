package com.javapractice;

import java.util.Scanner;

public class NrWargsMethods {

	void sumsOfNums(int a, int b) {
		int sum = a + b;
		System.out.println("Sum of numbers : " + sum);
	}

	void square(int c) {
		int sqr = c * c;
		System.out.println("Square of num : " + sqr);
	}

	void quotient(int d, int e) {
		double q = (double) d / e;
		System.out.println("quotient of nums :  " + q);
	}

	void cube(int f) {
		int cb = f * f * f;
		System.out.println("Cube of Nums : " + cb);
	}

	void average(int a, int b, int c) {
		double avg = (a + b + c) / 3.0;
		System.out.println("Average of three nums : " + avg);

	}
	void areaOfRectangle(int l , int b) {
		double rectarea = l*b;
		System.out.println("Area of Rectangle : "+ rectarea);
		
	}

	public static void main(String[] args) {
		NrWargsMethods c = new NrWargsMethods();
		c.sumsOfNums(10, 20);
		c.average(10, 20, 30);
		c.cube(5);
		c.square(5);
		c.quotient(20, 5);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length : ");
		int l = sc.nextInt();
		System.out.println("Enter breadth : ");
		int b = sc.nextInt();
		c.areaOfRectangle(l, b);
	}

}
