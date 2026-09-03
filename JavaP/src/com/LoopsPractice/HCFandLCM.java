package com.LoopsPractice;

import java.util.Scanner;

public class HCFandLCM {
	
	static void hcf(int a,int b) {
		int hcf=1;
		int min=(a<b)?a:b;
		for(int i =1;i<=min;i++) {
			if(a%i==0 && b%i==0) {
				hcf=i;
			}
		}
		int lcm=(a*b)/hcf;
		System.out.println("HCF : "+hcf);
		System.out.println("LCM : "+lcm);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		hcf(a,b);
		sc.close();

	}

}
