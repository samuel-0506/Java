package com.javapractice;

import java.util.Scanner;

public class Areas {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Areas r = new Areas();
		System.out.println("*************Area of Rectangle*************");
		System.out.println("Enter Length : ");
		int l = sc.nextInt();
		System.out.println("Enter Breath : ");
		int b = sc.nextInt();
		int rectArea = r.rectangleArea(l, b);
		System.out.println("Rectangle Area : " + rectArea);

		System.out.println("***********Radius of Circle**************");
		System.out.println("Enter R : ");
		double s = sc.nextDouble();
		System.out.println("Radius of Circle : "+ r.circleRadius(s));
		System.out.println("*************Area of Rectangle*************");
		System.out.println("Enter Breadth : ");
		double breadth = sc.nextDouble();
		System.out.println("Enter Height : ");
		double height = sc.nextDouble();
		System.out.println("Area of Triangle : " + r.triangleArea(breadth, height));
		System.out.println("*************Area of Rectangle*************");
		System.out.println("Enter Side : ");
		int side = sc.nextInt();
		System.out.println("Area of Square : "+ r.squareArea(side));

	}

	int rectangleArea(int l, int b) {
		int area = l * b;
		return area;
	}

	double circleRadius(double s) {
		double radius = Math.PI * s * s;
		return radius;
	}
	double triangleArea(double breadth, double height) {
		double area = 0.5 * breadth * height;
		return area;
	}
	int squareArea(int r) {
		int area = r*r;
		return area;
	}

}
