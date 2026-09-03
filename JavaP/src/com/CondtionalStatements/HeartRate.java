package com.CondtionalStatements;

import java.util.Scanner;

public class HeartRate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Heart Rate (BPM): ");
		int bpm = sc.nextInt();

		if (bpm <= 0) {
			System.out.println("Invalid Heart Rate");
		} 
		else if (bpm > 120) {
			System.out.println("Very High");
		}
		else if (bpm >= 101) {
			System.out.println("High");
		} 
		else if (bpm >= 60) {
			System.out.println("Normal");
		} else {
			System.out.println("Low");
		}

		sc.close();
	}
}
