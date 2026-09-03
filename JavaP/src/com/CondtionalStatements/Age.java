package com.CondtionalStatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		if(age<=0) {
			System.out.println("Enter Valid Age");
		}
		else if(age<=5) {
			System.out.println("Pilla Baccha");
		}
		else if (age<=12) {
			System.out.println("Nibba Gaadivi raa");
		}
		else if(age <=19) {
			System.out.println("Teenage Chaprii");
		}
		else if(age<=35) {
			System.out.println("Yoooouth");
		}
		else if(age<=60) {
			System.out.println("Middle aged");
		}
		else if(age>=61) {
			System.out.println("Old Aged");
		}
		else {
			System.out.println("Enter valid age");
		}

	}

}
