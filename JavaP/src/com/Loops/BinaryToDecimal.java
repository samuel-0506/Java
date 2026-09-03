package com.Loops;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static void bintoDec(int n) {
		int sum=0;
		int count=0;
		int temp=n;
		
		while(n>0) {
			count++;
			n=n/10;
		}
		n=temp;

		for(int i =0;i<count;i++) {
			int rem=n%10;
			sum=(int) (sum+rem*Math.pow(2, i));
			n=n/10;
		}
		
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Binary Number : ");
		int n=sc.nextInt();
		bintoDec(n);
		

	}

}
