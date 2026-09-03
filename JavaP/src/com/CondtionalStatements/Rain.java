package com.CondtionalStatements;

import java.util.Scanner;

public class Rain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Rainfall : ");
		int rainfall = sc.nextInt();

		if (rainfall < 0) {
			System.out.println("Invalid Rainfall");
		} 
		else if (rainfall > 100) {
			System.out.println("Very Heavy");
		} 
		else if (rainfall >= 51) {
			System.out.println("Heavy");
		} 
		else if (rainfall >= 11) {
			System.out.println("Moderate");
		} else {
			System.out.println("Light");
		}

		sc.close();
	}
}
