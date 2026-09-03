package com.CondtionalStatements;

import java.util.Scanner;

public class ScreenTime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Screen Time (Hours): ");
		int hours = sc.nextInt();

		if (hours < 0) {
			System.out.println("Invalid Screen Time");
		} 
		else if (hours > 8) {
			System.out.println("Excessive");
		} 
		else if (hours >= 6) {
			System.out.println("High");
		} 
		else if (hours >= 3) {
			System.out.println("Moderate");
		} else {
			System.out.println("Healthy");
		}

		sc.close();
	}
}
