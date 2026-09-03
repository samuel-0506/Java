package com.CondtionalStatements;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count;
		System.out.println("Welcome to My ATM");
		System.out.println("Enter ATM pin : ");
		int pin = sc.nextInt();
		if (pin == 4567) {
			System.out.println("You Entered Correct Pin");
			System.out.println("Acc Limit : ");
			double limit = sc.nextDouble();

			if (limit <= 49000) {
				System.out.println("You Have Sufficient limit..!!");
				System.out.println("Acc balance : ");
				double accbal = sc.nextDouble();

				if (accbal > 0) {
					System.out.println("You are eligible for withdrawl");
					System.out.println("With Drawl amount : ");
					double amount=sc.nextDouble();
					
					if(amount<accbal) {
						System.out.println(amount+ " Withdrawed");
						System.out.println("Remaining amount : " + (accbal-amount));
					}else {
						System.out.println("Failed");
					}
					
				} else {
					System.out.println("You don't have sufficient funds");
				}
			} else {
				System.out.println("You have Reached Daily limit");
			}
		} else {
			System.out.println("You Entered incorrect Pin");
		}

	}

}
