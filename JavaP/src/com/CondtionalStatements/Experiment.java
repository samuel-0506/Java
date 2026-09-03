package com.CondtionalStatements;

import java.util.Scanner;

public class Experiment {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Gender : ");
		String gender = sc.nextLine();
		if(gender.equalsIgnoreCase("female")) {
			System.out.println("You are not eligible to enter");
			System.out.println("Hiiii");
		}
		else if(gender.equalsIgnoreCase("male")) {
			System.out.println("Your eligible to enter");
			System.out.println("Byeee");

		}
		else {
			System.out.println("Get out of here");
		}
sc.close();
	}

}
