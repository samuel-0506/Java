package com.Loops;

import java.util.Scanner;

public class PerfectNum {
	static int sum=0;
	
	static void perfectNum(int n) {
		for(int i = 1;i<n;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n + " is a perfect Number");
		}else {
			System.out.println(n + " is not a perfect Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		perfectNum(n);
	}

}
