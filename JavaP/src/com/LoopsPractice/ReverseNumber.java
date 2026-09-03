package com.LoopsPractice;

import java.util.Scanner;

public class ReverseNumber {
	
	static int rev=0;

	static void reverseNumber(int n) {
		int original=n; 
		for(;n>0;n=n/10) {							// same logic
			int digit=n%10;
			rev=rev*10+digit;
		}
		System.out.println("Before Reverse : "+original);  //reverse a number
		System.out.println("After Reverse : "+rev);
		
		if(rev==original) {										//palindrome
			System.out.println(original + " is a palindrome");
		}
		else {
			System.out.println(original + " is not a palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		reverseNumber(n);

	}

}
