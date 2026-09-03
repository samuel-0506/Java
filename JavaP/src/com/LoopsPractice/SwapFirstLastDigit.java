package com.LoopsPractice;

import java.util.Scanner;

public class SwapFirstLastDigit {

	static void swapDigits(int n) {

		int original = n;
		int last = n % 10;
		int count = 0;
		int temp = n;
		while (temp > 0) {
			count++;
			temp = temp / 10;
		}
		// Find 10^(count-1)
		int power = 1;
		for (int i = 1; i < count; i++) {
			power = power * 10;
		}
		temp = n;
		while (temp >= 10) {
			temp = temp / 10;
		}
		int first = temp;
		int middle = (n % power) / 10;
		int result = (last * power) + (middle * 10) + first;
		System.out.println("Original Number : " + original);
		System.out.println("After Swapping  : " + result);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		swapDigits(n);
		sc.close();
	}
}