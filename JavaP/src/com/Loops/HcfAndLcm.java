package com.Loops;

import java.util.Scanner;

public class HcfAndLcm {
	static int hcf = 1;
	static void results(int a , int b) {
		for(int i = 1;i<=a && i<b;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
				System.out.println("HCF : "+hcf);
			}
		}
		int lcm=(a*b)/hcf;
		System.out.println("LCM : "+ lcm);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two values : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		results(a,b);
	}

}
