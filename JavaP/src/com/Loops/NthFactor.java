package com.Loops;

import java.util.Scanner;

public class NthFactor {
	static int count=0;
	
	static void thirtdFactor(int n) {
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
				if(count==3) {
					System.out.println("Third Factor of Given number : " + i);
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		thirtdFactor(n);

	}

}
