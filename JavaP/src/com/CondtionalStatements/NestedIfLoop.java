package com.CondtionalStatements;

import java.util.Scanner;

public class NestedIfLoop {

	public static void main(String[] args) {
		String yn;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter Num 1 : ");
			int a=sc.nextInt();
			System.out.println("Enter Num 2 : ");
			int b=sc.nextInt();
			System.out.println("Enter +,-,*,/,%");
			String result=sc.next();
			
			switch(result) {
			case "+" -> System.out.println("Results : "+(a+b));
			case "-" -> System.out.println("Results : "+(a-b));
			case "*" -> System.out.println("Results : "+(a*b));
			case "/" -> System.out.println("Results : "+(a/b));
			case "%" -> System.out.println("Results : "+(a%b));
			default -> System.out.println(" InCorrect Symbol ");
			}
			
			System.out.println("Do you want to continue...? Type Y for yes N for No");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("Y")) ;
		System.out.println("Program Ended");
		sc.close();


	}

}
