package com.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method Started ");

		try {
			System.out.println("Enter a Number : ");
			int a = sc.nextInt();
			System.out.println("Enter another Number : ");
			int b = sc.nextInt();
			System.out.println(a / b);
		} catch (Exception e) {
			System.out.println("in catch 1");
			e.printStackTrace();
		}
		System.out.println("Main method Ended ");
	}
}
