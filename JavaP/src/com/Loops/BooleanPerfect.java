package com.Loops;

import java.util.Scanner;

public class BooleanPerfect {
	static int sum=0;
	
	static boolean isPerfect(int n) {
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				sum+=i;
			}
		}
		return sum==n;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		System.out.println(isPerfect(n));
	}

}
