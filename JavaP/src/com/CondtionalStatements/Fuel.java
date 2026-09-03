package com.CondtionalStatements;

import java.util.Scanner;

public class Fuel {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Fuel Level (%): ");
		int fuel = sc.nextInt();

		if (fuel < 0 || fuel > 100) {
			System.out.println("Invalid Fuel Level");
		} 
		else if (fuel >= 75) {
			System.out.println("Full Tank");
		}
		else if (fuel >= 50) {
			System.out.println("Half Tank");
		}
		else if (fuel >= 25) {
			System.out.println("Low Fuel");
		} else {
			System.out.println("Refill Immediately");
		}

		sc.close();
	}
}