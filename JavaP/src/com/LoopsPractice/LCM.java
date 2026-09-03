package com.LoopsPractice;

import java.util.Scanner;

public class LCM {

		static void lcm(int a ,int b) {
			int max=(a>b)?a:b;
			for(int i =max; ;i++) {
				if(i%a==0 && i%b==0) {
					System.out.println("LCM : " + i);
					break;
				}
			}
		}
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		lcm(a,b);
		sc.close();
	}

}
