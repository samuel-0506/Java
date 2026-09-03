package com.CondtionalStatements;

import java.util.Scanner;

public class DrivingLicense {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age<=0) {
			System.out.println("Enter valid age");
		}
		else if(age>=18) {
			System.out.println("You are Eligible for Driving license !!");
		}
		else {
			System.out.println("Pedda ayyaka dhaa");
		}
		sc.close();
	}

}
