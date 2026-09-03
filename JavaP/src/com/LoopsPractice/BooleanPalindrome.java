package com.LoopsPractice;

import java.util.Scanner;

public class BooleanPalindrome {
	static int rem=0;
	static int rev=0;
	
	static boolean isPalindrome(int n) {
		rev=0;
		int temp=n;
		for(;n>0;n=n/10) {
			rem=n%10;
			rev=rev*10+rem;
		}
			return rev==temp;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n =sc.nextInt();

			if(isPalindrome(n)) {
				System.out.println(n +" is a palindrome");
			}else {
				System.out.println(n + " is not a palindrome");
			}
	}
}
