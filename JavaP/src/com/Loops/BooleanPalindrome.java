package com.Loops;

import java.util.Scanner;

public class BooleanPalindrome {
	
	static boolean palindrome(int n) {
		int rev=0;
		int temp=n;
		for(;n>0;n=n/10) {
			int rem=n%10;
			rev=rev*10+rem;
			}
		return temp==rev;
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n  =sc.nextInt();
		System.out.println(palindrome(n));
		sc.close();

	}

}
