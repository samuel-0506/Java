package com.Loops;

import java.util.Scanner;

public class NthOdd {
	static void odd(int n){
		int res=2*n-1;
		System.out.println(res);
		
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a value : ");
		int n = sc.nextInt();
		odd(n);		
	}

}
