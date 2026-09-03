package com.LoopsPractice;

import java.util.Scanner;

public class SumofDigits {
	
	static int sum=0;
	static void sumofDigits(int n) {
		for(;n>0;n=n/10) {
			int digit=n%10;
			sum=sum+digit;
		}
		System.out.println("Sum of Digits : "+ sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		sumofDigits(n);
		

	}

}
