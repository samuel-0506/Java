package com.CondtionalStatements;

import java.util.Scanner;

public class CGPA {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter CGPA: ");
		double cgpa = sc.nextDouble();

		if (cgpa < 0 || cgpa > 10) {
			System.out.println("Invalid CGPA");
		} 
		else if (cgpa >= 9) {
			System.out.println("Outstanding");
		} 
		else if (cgpa >= 8) {
			System.out.println("Excellent");
		} 
		else if (cgpa >= 7) {
			System.out.println("Very Good");
		} 
		else if (cgpa >= 6) {
			System.out.println("Good");
		} else {
			System.out.println("Average");
		}

		sc.close();
	}
}
