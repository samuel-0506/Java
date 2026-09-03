package com.LoopsPractice;

import java.util.Scanner;

public class MagicNumber2 {
	
	static int sum =0;
	static int count=0;
	static void  magicNumber(int n) {
		int temp=n;
		while(n>9) {
			int sum = 0;
			
			for(;n>0;n=n/10) {
				int digits=n%10;
				sum=sum+digits;
			}
			System.out.println("Sum of Numbers : "+sum);
			n=sum;
			count++;
			System.out.println("Loop Count : " + count);
		}
		if(n==1) {
			System.out.println(temp+ " is a Magic Number");
		}else {
			System.out.println(temp +" is not a magic Number");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		magicNumber(n);
		sc.close();
	}
}
