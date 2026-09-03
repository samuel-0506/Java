package com.CondtionalStatements;

import java.util.Scanner;

public class NestedIf2 {

	public static void main(String[] args) {
		System.out.println("Welcome to my SR college !!");
		System.out.println("");
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Did you Pass 12th Grade...?");
		boolean passStatus=sc.nextBoolean();
		
		if(passStatus) {
			System.out.println("Good you passed your 12th Grade");
			System.out.println("Enter Percentage : ");
			double percentage=sc.nextDouble();
			
			if(percentage>=75) {
				System.out.println("You're Percentage matched with our requirement");
				System.out.println("Qualified Entrance Exam...?");
				boolean enExam=sc.nextBoolean();
				
				if(enExam) {
					System.out.println("Congrats for cleared your exam");
					System.out.println("Documents verified...?");
					boolean docs=sc.nextBoolean();
					
					if(docs) {
						System.out.println("Your Documents verified");
						System.out.println("fee paid...?");
						boolean fee=sc.nextBoolean();
						
						if(fee) {
							System.out.println("Admission comfirmed");
						}else {
							System.out.println("Admisson Failed");
						}
					}else {
						System.out.println("Admissiom Failed : documents verification pending");
					}
				}else {
					System.out.println("Admission Failed : You're not cleared Exam");
				}
			}else {
				System.out.println("Admission Failed : you're percentage didn'd matched");
			}
		}else {
			System.out.println("Admission Failed : first complete your 12th");
		}

	}

}
