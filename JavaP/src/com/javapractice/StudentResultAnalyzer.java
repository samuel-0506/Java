package com.javapractice;

import java.util.Scanner;

public class StudentResultAnalyzer {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		StudentResultAnalyzer s = new StudentResultAnalyzer();
		System.out.println("Enter M1 : ");
		int m1 = sc.nextInt();
		System.out.println("Enter M2 : ");
		int m2 = sc.nextInt();
		System.out.println("Enter M3 : ");
		int m3 = sc.nextInt();
		System.out.println("Enter M4 : ");
		int m4 = sc.nextInt();
		System.out.println("Enter M5 : ");
		int m5 = sc.nextInt();
		
		int total = s.calculateTotal(m1, m2, m3, m4, m5);
		System.out.println(total);
		System.out.println(s.calculatePercentage(total));
		System.out.println(s.calculateAverage(total));


	}

	int calculateTotal(int m1, int m2, int m3, int m4, int m5) {
		int sum = m1 + m2 + m3 + m4 + m5;
		return sum;
	}

	double calculatePercentage(double r) {
		return r = r / 500 * 100;
	}

	double calculateAverage(double a) {
		return a = a/5;
	}

}
