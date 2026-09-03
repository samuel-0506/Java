package com.LoopsPractice;

import java.util.Scanner;

public class PrimeNumsWithRange {
	
	static boolean isPrime(int n) {
		if(n<=1) {
			return false;
		}
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}return true;
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Starting Number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter Ending  Number: ");
		int n2 = sc.nextInt();
		
		for(int i =n1;i<=n2;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
		
	}
}
	