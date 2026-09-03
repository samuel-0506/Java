package com.CondtionalStatements;

import java.util.Scanner;

public class Income {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Annual Income: ");
		int income = sc.nextInt();

		if (income < 0) {
			System.out.println("Invalid Income");
		} 
		else if (income > 800000) {
			System.out.println("High Income");
		} 
		else if (income >= 300000) {
			System.out.println("Middle Income");
		} else {
			System.out.println("Low Income");
		}

		sc.close();
	}
}