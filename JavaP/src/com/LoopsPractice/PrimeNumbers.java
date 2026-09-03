package com.LoopsPractice;

import java.util.Scanner;

public class PrimeNumbers {
	static int count = 0;

	static void primeNums(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}		if (count == 2) {
			System.out.println(n + " is a Prime Number");
		}else {
			System.out.println(n+ " is not a prime Number");
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		primeNums(n);
		sc.close();
	}

}
