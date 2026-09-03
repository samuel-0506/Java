package com.LoopsPractice;

import java.util.Scanner;

public class Fibonacci {
	static int n1=0;
	static int n2=1;
	static int n3=0;
	
	static void fibonacci(int n) {
		System.out.print(n1+" "+n2);
		for(int i = 1;i<=n-2;i++) {
			n3=n1+n2;

		 System.out.print(" " +n3);
			n1=n2;
			n2=n3;
	}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		fibonacci(n);

	}

}
