package com.CondtionalStatements;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Angle 1 : ");
		int a1 = sc.nextInt();
		System.out.println("Enter Angle 2 : ");
		int a2=sc.nextInt();
		System.out.println("Enter Angle 3 : ");
		int a3=sc.nextInt();
		int angle = a1+a2+a3;
		System.out.println("Enter side 1");
		int a = sc.nextInt();
		System.out.println("Enter side 2");
		int b = sc.nextInt();
		System.out.println("Enter side 3");
		int c = sc.nextInt();
		if(angle<=0) {
			System.out.println("Enter valid Angles");
		}
		else if(angle==180 && (a+b)>c && (a+c)>b && (b+c)>a) {
			System.out.println("Traiangle formed");
		}
				else {
			System.out.println("Traingle formation failed");
		}
		sc.close();
	}

}
