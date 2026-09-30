package com.ExceptionHandling;

import java.util.Scanner;

class passException2 extends Exception{

	public passException2(String s) {
		super(s);
	}
	
}

public class CustomException3 {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter password : ");
		int pass = sc.nextInt();
		if(pass==12345) {
			System.out.println("Correct Password !! Successufully logged in ");
		}else {
			throw new passException2("Incorrect password");
		}
	}catch(passException2 e) {
		System.out.println(e.getMessage());
	}

}
}
