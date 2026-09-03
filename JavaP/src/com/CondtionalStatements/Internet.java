package com.CondtionalStatements;

import java.util.Scanner;

public class Internet {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Internet Speed (Mbps): ");
		int speed = sc.nextInt();

		if (speed < 0) {
			System.out.println("Invalid Speed");
		} 
		else if (speed >= 100) {
			System.out.println("Very Fast");
		} 
		else if (speed >= 50) {
			System.out.println("Fast");
		} 
		else if (speed >= 10) {
			System.out.println("Average");
		} else {
			System.out.println("Slow");
		}

		sc.close();
	}
}
