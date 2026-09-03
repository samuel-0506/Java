package com.Loops;

import java.util.Scanner;

public class HappyNumber {
	static int sump = 0;

	static void happyNumber(int n) {
		while(n!=1 && n!=4) {
		sump = 0;
		while (n > 0) {
			int r = n % 10;
			sump = sump + (r * r);
			n = n / 10;
		}
		n=sump;
		}
		System.out.println(sump);
		if (sump == 1) {
			System.out.println("Given number is a Happy Number");
		} else {
			System.out.println("Given Number is not Happy Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		happyNumber(n);

	}

}
