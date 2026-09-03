package com.javapractice;

import java.util.Scanner;

public class WRWArgs {
	static Scanner sc = new Scanner(System.in);

	double average(int a, int b, int c, int d, int e) {
		double avg =(double) (a + b + c + d + e)/5;
		return avg;
	}

	public static void main(String[] args) {
		WRWArgs s = new WRWArgs();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		System.out.println("Avg salary : " + s.average(a, b, c, d, e));

	}

}
