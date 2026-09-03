package com.LoopsPractice;

import java.util.Scanner;

public class Factorial {
	static int fact =1;
	
	static void factorial(int n ) {
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		factorial(n);
		sc.close();
	}

}
