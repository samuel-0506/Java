package com.operators;

public class TernaryOperators {

	public static void main(String[] args) {

		int orderAmount = 500;
		String status = (orderAmount >= 499) ? "Eligible" : "Not eligible";
		System.out.println("Free delivery Status : "+ status);
		
		double percentage=79.9;
		String admission=(percentage>=75)? "Eligible":"Not Eligible";
		System.out.println("For Admission : " +admission);
		
		int age = 14;
		String movieTicket =(age<12)?"Qualifies":"Not Qualifies";
		System.out.println("For Movies Ticket : "+movieTicket);
		
		int balance=2000;
		String requirement=(balance>=1000)?"Reached":"Not Reached";
		System.out.println("Minimum Bank Balance : "+requirement);
		
	}

}
