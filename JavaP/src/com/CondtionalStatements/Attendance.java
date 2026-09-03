package com.CondtionalStatements;

import java.util.Scanner;

public class Attendance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Attendance Percentage: ");
		int attendance = sc.nextInt();

		if (attendance < 0 || attendance > 100) {
			System.out.println("Invalid Attendance");
		} 
		else if (attendance >= 75) {
			System.out.println("Eligible for Exam");
		}
		else {
			System.out.println("Not Eligible for Exam");
		}

		sc.close();
	}
}
