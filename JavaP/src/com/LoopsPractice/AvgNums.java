package com.LoopsPractice;

import java.util.Scanner;

public class AvgNums {
	
	static void sum(int a,int b ) {
		int sum=0;
		int count=0;
		for(int i =a;i<=b;i++) {
			sum=sum+i;
			count++;
		}
		double avg=(double)sum/count;
		System.out.println("Average : " +avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sum(a,b);
	}

}
