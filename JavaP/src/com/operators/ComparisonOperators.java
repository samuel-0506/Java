package com.operators;
import java.util.Scanner;

public class ComparisonOperators {


		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Amount : ");
			int orderAmount = sc.nextInt();
			System.out.println("Free delivery : " + (orderAmount>499 ));
			

			System.out.println("Enter Percentage : ");
			double percentage = sc.nextDouble();
			System.out.println("Eligible For Admission : " + (percentage >= 75));

			System.out.println("Enter age : ");
			int age = sc.nextInt();
			System.out.println("Eligible For Movies Ticket : " + (age < 12));

			System.out.println("Enter Balance : ");
			int balance = sc.nextInt();
			System.out.println("Minimum Bank Balance : " + (balance >=1000));
			sc.close();


		}

	}


