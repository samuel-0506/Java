package com.CondtionalStatements;

import java.util.Scanner;

public class NestedIf3 {

	public static void main(String[] args) {
		System.out.println("Welcome to Samuel Bank");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();

		if (age >= 20) {
			System.out.println("Enter CitizenShip : ");
			boolean citizen = sc.nextBoolean();

			if (citizen) {
				System.out.println("Enter Salary : ");
				double salary = sc.nextDouble();

				if (salary >= 40000) {
					System.out.println("Enter Credit Score : ");
					int creditScore = sc.nextInt();

					if (creditScore >= 720) {
						System.out.println("Is there any Existing Loan : ");
						boolean existLoan=sc.nextBoolean();
						
						if(!existLoan) {
							System.out.println("Loan Approved!!!");
						}
						else {
							System.out.println("Loan Rejected");
						}

					}
					else {
						System.out.println("Loan Rejected : Credit is not sufficient");
					}
				} else {
					System.out.println("Loan Rejected : Your Salary is low ");
				}
			} else {
				System.out.println("Loan Rejected : You must have indian citizenship ");
			}
		} else {
			System.out.println("Loan Rejected : Your Age must be above 20 years");
		}

	}

}
