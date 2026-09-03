package com.javapractice;

import java.util.Scanner;

public class Square {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Square s = new Square();
		System.out.println("Enter Num : ");
		int a = sc.nextInt();
		double c = s.squareNumber(a);
		System.out.println(c);

	}
	 double squareNumber(int a) {
		 return a*a;
	 }

}
