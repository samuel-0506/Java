package com.CondtionalStatements;

import java.util.Scanner;

public class CreditScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Credit Score: ");
		int score = sc.nextInt();

		if (score < 0 || score > 900) {
			System.out.println("Invalid Credit Score");
		} 
		else if (score >= 750) {
			System.out.println("Excellent");
		} 
		else if (score >= 650) {
			System.out.println("Good");
		}
		else if (score >= 550) {
			System.out.println("Average");
		} else {
			System.out.println("Poor");
		}

		sc.close();
	}
}
