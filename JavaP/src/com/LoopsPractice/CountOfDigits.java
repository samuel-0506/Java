package com.LoopsPractice;

import java.util.Scanner;

public class CountOfDigits {
	
	static int count=0;
	
	static void countOfDigits(int n) {
//		for(;n>0;n=n/10) {
//			count++;
//		}
		while(n>0) {
			n=n/10;
			count++;
		}
		System.out.println("Count of Number : "+ count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter NUmber : ");
		int n = sc.nextInt();
		countOfDigits(n);

	}

}
