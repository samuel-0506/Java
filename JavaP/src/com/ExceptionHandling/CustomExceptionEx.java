package com.ExceptionHandling;

import java.util.Scanner;

class samuelException extends Exception{

	samuelException(String s) {		
		super(s);
	}
	
}

public class CustomExceptionEx {

	public static void main(String[] args) throws samuelException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age : ");
		int age = sc.nextInt();
		
		if(age>=18) {
			System.out.println("Your are eligible for Voting , Driving");
		}else {
			throw new samuelException("Pilla Baccha Gaadivi");
		}
	}

}
