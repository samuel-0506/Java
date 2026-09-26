package com.ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Arth_InpMisMatExp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Main method Started ");
		
		try {
			System.out.println("Enter a Number : ");
			int a = sc.nextInt();
			System.out.println("Enter another Number : ");
			int b = sc.nextInt();
			System.out.println(a/b);
		}catch(ArithmeticException e) {
			System.out.println("in catch 1");
			System.err.println(e.getMessage());
		}catch(InputMismatchException e){
			System.out.println("in catch 2");
			e.printStackTrace();
		}
		System.out.println("Main method Ended ");
	}
}
