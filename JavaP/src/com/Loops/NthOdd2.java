package com.Loops;

import java.util.Scanner;

public class NthOdd2 {
	static int count=0;
	
	static void nthodd(int n){
		for(int i =1; ;i=i+2) {
		count++;
		if(count==n) {
			System.out.println(i);
			break;
		}
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		nthodd(n);

	}

}
