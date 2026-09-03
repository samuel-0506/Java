package com.operators;

import java.util.Scanner;

public class TernaryScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Amount : ");
		int orderAmount = sc.nextInt();
		String status = (orderAmount >= 499) ? "Eligible" : "Not eligible";

		System.out.println("Enter Percentage : ");
		double percentage = sc.nextDouble();
		String admission = (percentage >= 75) ? "Eligible" : "Not Eligible";

		System.out.println("Enter age : ");
		int age = sc.nextInt();
		String movieTicket = (age < 12) ? "Qualifies" : "Not Qualifies";

		System.out.println("Enter Balance : ");
		int balance = sc.nextInt();
		String requirement = (balance >= 1000) ? "Reached" : "Not Reached";

		System.out.println("Free delivery : " + status);
		System.out.println("For Admission : " + admission);
		System.out.println("For Movies Ticket : " + movieTicket);
		System.out.println("Minimum Bank Balance : " + requirement);

	}

}
