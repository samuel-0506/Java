package com.Loops;

import java.util.Scanner;

public class Automorphic {

	static void automorphic(int n) {
		int temp = n;
		int square = n * n;
		int digits = 0;

		while (temp > 0) {
			digits++;
			temp = temp / 10;
		}
		int divisor = 1; 
		for (int i = 1; i <= digits; i++) { 
			divisor = divisor * 10;
		}

		if ((square) % divisor == n) {
			System.out.println(n + " is a Automorphic Number");
		} else {
			System.out.println(n + " is not a Automorphic Number");
		}
		System.out.println(digits);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Number : ");
		int n = sc.nextInt();
		automorphic(n);
		sc.close();
	}

}
