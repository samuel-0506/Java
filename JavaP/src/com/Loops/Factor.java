package com.Loops;

import java.util.Scanner;

public class Factor {

	static void factor(int n) {
		for (int i = 1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.print(i+" ");
			}
			
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		factor(n);
		System.out.print(n);
	}

}
