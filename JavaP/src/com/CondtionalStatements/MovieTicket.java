package com.CondtionalStatements;

import java.util.Scanner;

public class MovieTicket {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age<=0) {
			System.out.println("Enter Valid Age");
		}
		else if(age<=4) {
			System.out.println("Free");
		}
		else if (age<=12) {
			System.out.println("Child");
		}
		else if(age <=59) {
			System.out.println("Adult");
		}
		else if(age>=60) {
			System.out.println("Senior Citizen");
		}
		else {
			System.out.println("Enter valid age");

	}
		sc.close();

	}}
