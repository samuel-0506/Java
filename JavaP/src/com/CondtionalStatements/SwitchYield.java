package com.CondtionalStatements;

import java.util.Scanner;

public class SwitchYield {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Grade : A/B/C/D");
		String grade = sc.next();
		String results = switch (grade) {
		case "A" -> {
			System.out.println("you got A grade");
			yield "Excellent";
		}
		case "B" -> {
			System.out.println("you got B grade");
			yield "Good";
		}
		case "C" -> {
			System.out.println("you got C grade");
			yield "Average";
		}
		case "D" -> {
			System.out.println("you got D grade");
			yield "Poor";
		}
		case "E" -> {
			System.out.println("you got A grade");
			yield "Just Passed";
		}
		default -> {
			System.out.println("Incorrect Grade");
			yield "Fail";
		}

		};
		System.out.println("Results : "+results);
	}

}
