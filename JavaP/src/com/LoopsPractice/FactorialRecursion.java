package com.LoopsPractice;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return fact(n-1)*n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		int fact=fact(n);
		System.out.println(fact);
		sc.close();

	}
}
