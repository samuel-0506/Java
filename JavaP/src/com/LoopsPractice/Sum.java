package com.LoopsPractice;

import java.util.Scanner;

public class Sum {
	
	static void sum(int a,int b ) {
		int sum=0;
		for(int i =a;i<=b;i++) {
			if(i%2==0) {
			sum=sum+i;
		}}
		System.out.println("Sum of even nums : " +sum);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a,b);
	}

}
