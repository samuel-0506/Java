package com.CondtionalStatements;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter s1 Marks : ");
		int s1 = sc.nextInt();
		System.out.println("Enter s2 Marks : ");
		int s2 = sc.nextInt();
		System.out.println("Enter s3 Marks : ");
		int s3 = sc.nextInt();
		System.out.println("Enter s4 Marks : ");
		int s4 = sc.nextInt();
		System.out.println("Enter s5 Marks : ");
		int s5 = sc.nextInt();
		double total=s1+s2+s3+s4+s5;
		double avg=total/5;
		System.out.println("Average Marks : " + avg);
		double percentage=(total/500)*100;
		System.out.println("Percentage : "+ percentage);
		
		if (avg > 100 || avg < 0) {
			System.out.println("Invalid Marks");
		} else if (avg >= 90) {
			System.out.println("Grade A+");
		} else if (avg >= 80) {
			System.out.println("Grade A");
		} else if (avg >= 70) {
			System.out.println("Grade B");
		} else if (avg >= 60) {
			System.out.println("Grade C");
		} else if (avg >= 50) {
			System.out.println("Grade D");
		} else if (avg >= 35) {
			System.out.println("Just Passed");
		} else {
			System.out.println("Failed");
		}

	}

}
