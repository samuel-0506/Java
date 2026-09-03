package com.LoopsPractice;

import java.util.Scanner;

public class ArmStrongNumber {

	
	static void armStrong(int n) {
		int count=0;
		int temp =n;
		double sum=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		
		n=temp;
		while(n>0) {
			int rem=n%10;
			sum=sum+Math.pow(rem, count);
			n=n/10;
		}
		System.out.println("Total Sum of Digits powers : "+(int)sum);
		if(sum==temp) {
			System.out.println(temp+" is an ArmStrong Number");
		}else {
			System.out.println(temp+" is not an ArmStrong Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		armStrong(n);
		sc.close();

	}

}
