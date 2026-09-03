package com.Loops;

import java.util.Scanner;

public class Palindrome {
	
	static void palindrome(int n) {
		int rev=0;
		int temp=n;
		for(;n>0;n=n/10) {
			int rem=n%10;
			rev=rev*10+rem;
			}
		
			if(temp==rev) {
				System.out.println(temp + " is a palindrome");
			}
			else {
				System.out.println(temp +" is not a palindrome");
			}
		}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n  =sc.nextInt();
		palindrome(n);
		sc.close();

	}

}
