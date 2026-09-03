package com.Loops;

import java.util.Scanner;

public class NeonNumber {
	
	static void neonNum(int n) {
		
		int sum =0;
		int square=n*n;
		int temp =n;
		
		while(square>0) {
			int rem=square%10;
			sum=sum+rem;
			square=square/10;
		}

		if(temp==sum) {
			System.out.println(temp+" is a Neon Number");
		}else {
			System.out.println(temp+" is not Neon Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n  =sc.nextInt();
		neonNum(n);

	}

}
