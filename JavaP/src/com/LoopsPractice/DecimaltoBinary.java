package com.LoopsPractice;

import java.util.Scanner;

public class DecimaltoBinary {
	
	static void binaryToDec(int n) {
		String binary="";
		
		while(n>0) {
			int rem=n%2;
			binary=rem+binary;
			n=n/2;
		}
		System.out.println("Binary : "+binary);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter an Number : ");
		int n = sc.nextInt();
		binaryToDec(n);

	}

}
