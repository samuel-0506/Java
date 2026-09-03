package com.CondtionalStatements;

import java.util.Scanner;

public class NestedIf1 {

	public static void main(String[] args) {
		System.out.println("Welcome to Sam Companyyy!!!");
		System.out.println("Promotion Process");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Is the Employee permanent....?");
		boolean status=sc.nextBoolean();
		
		if(status) {
			System.out.println("You are permanent Employee");
			System.out.println("");
			System.out.println("Enter Experience..");
			int experience=sc.nextInt();
			
			if(experience>=5) {
				System.out.println("Congrats you have High Experience");
				System.out.println("");
				System.out.println("Enter Emp rating..");
				int rating=sc.nextInt();
				
				if(rating>=4) {
					System.out.println("Good you have enough rating");
					System.out.println("");
					System.out.println("No Disciplinary Action");
					boolean action=sc.nextBoolean();
					
					if(action) {
						System.out.println("Good You're well disciplined");
						System.out.println("");
						System.out.println("Your manager approved....?");
						boolean approval=sc.nextBoolean();
						
						if(approval) {
							System.out.println("Congratulations Promotion Granted");
						}else {
							System.out.println("Sorry Promotion declined");
						}
					}else {
						System.out.println("Improve your discipline");
					}
				}else {
					System.out.println("Your rating have to be improved");
				}
				
			}else {
				System.out.println("Sorry you are not experienced");
			}
		}else {
			System.out.println("You are not eligible for promotion");
		}
	}

}
