package com.CondtionalStatements;

import java.util.Scanner;

public class AirQuality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount: ");
		int aqi = sc.nextInt();

		if (aqi < 0) {
			System.out.println("Invalid Quality");
		} 
		else if (aqi <= 50) {
			System.out.println("Good");
		}
		else if (aqi <= 100) {
			System.out.println("Moderate");
		}
		else if (aqi <= 200) {
			System.out.println("Poor");
		} else {
			System.out.println("Very Poor");
		}

		sc.close();
	}
}