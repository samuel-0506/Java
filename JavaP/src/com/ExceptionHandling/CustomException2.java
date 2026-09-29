package com.ExceptionHandling;

import java.util.Scanner;

class passException extends Exception{

	public passException(String s) {
		super(s);
	}
	
}

public class CustomException2 {

	public static void main(String[] args) throws passException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password : ");
		int pass = sc.nextInt();
		if(pass==12345) {
			System.out.println("Correct Password !! Successufully logged in ");
		}else {
			throw new passException("Incorrect Password !! try again ...");
		}
	}

}
