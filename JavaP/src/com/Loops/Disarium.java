package com.Loops;

import java.util.Scanner;

public class Disarium {
	static void disarium(int n) {
		int temp=n;
		int count=0;
		int rem=0;
		int sum=0;
		while(n>0) {
			n=n/10;
			count++;
		}
		n=temp;
		for(int i=count;i>0;i--) {
			rem=n%10;
			int pow=(int) Math.powExact(rem,i);
			n=n/10;
			sum=sum+pow;
		}
		System.out.println(temp);

		if(sum==temp) {
			System.out.println("It is a Disarium Number");
		}else {
			System.out.println("It is a Not Disarium Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		disarium(n);
		sc.close();
	}

}
