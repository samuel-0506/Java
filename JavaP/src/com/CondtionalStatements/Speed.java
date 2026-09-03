package com.CondtionalStatements;

import java.util.Scanner;

public class Speed {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Vehicle Speed : ");
		int speed = sc.nextInt();

		if (speed < 0) {
			System.out.println("Invalid Speed");
		} 
		else if (speed > 80) {
			System.out.println("Overspeeding");
		}
		else if (speed >= 61) {
			System.out.println("Fast");
		}
		else if (speed >= 41) {
			System.out.println("Normal");
		} else {
			System.out.println("Safe");
		}

		sc.close();
	}
}
