package com.LoopsPractice;

import java.util.Scanner;

public class Palindrome {
	static int rev = 0;
	static int rem = 0;

	static void palindrome(int n) {
		int temp = n;
		for (; n > 0; n = n / 10) {
			rem = n % 10;
			rev = rev * 10 + rem;
		}
		if (temp == rev) {
			System.out.println(temp + " is a palindrome");
		} else {
			System.out.println(temp + " is not  palindrome");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		palindrome(n);
	}

}
