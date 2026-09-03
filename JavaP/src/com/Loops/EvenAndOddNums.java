package com.Loops;

import java.util.Scanner;

public class EvenAndOddNums {
	
	static void evenOdd(int n) {
		if(n<=100) {
			System.out.print(n + " ");
			evenOdd( n+2);
		}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num : ");
		int n = sc.nextInt();
		evenOdd(n);

	}

}
