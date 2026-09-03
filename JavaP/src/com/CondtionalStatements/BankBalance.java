package com.CondtionalStatements;

import java.util.Scanner;

public class BankBalance {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Account Balance: ");
		int balance = sc.nextInt();

		if (balance < 0) {
			System.out.println("Overdrawn");
		}
		else if (balance >= 10000) {
			System.out.println("Healthy Balance");
		}
		else if (balance >= 1000) {
			System.out.println("Normal Balance");
		} else {
			System.out.println("Low Balance");
		}

		sc.close();
	}
}
