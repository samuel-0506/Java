package com.Loops;

import java.util.Scanner;

public class MagicNumber {

	static int sum = 0;
	static int count = 0;

	static void sumofDigits(int n) {

		while (n > 9) {
			sum = 0;
			for (; n > 0; n = n / 10) {
				int digit = n % 10;
				sum = sum + digit;
			}
			System.out.println("Sum of Digits : " + sum);
			n = sum;
			count++;
		}
		if (n == 1) {
			System.out.println("Magic Number");
		} else {
			System.out.println("Not a Magic Number");
		}
		System.out.println("Final Count : " + count);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		sumofDigits(n);

		sc.close();
	}
}