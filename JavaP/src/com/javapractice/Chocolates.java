package com.javapractice;
import java.util.Scanner;

public class Chocolates {
	static double chocolatess=18.5;
	static int offer = 5;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount : ");
		int a = sc.nextInt();
		double b= a/chocolatess;
		double f = a%chocolatess;
		double c = b/offer;
		int d = (int)(b+c);
		System.out.println("Total Chocolates : " + d);
		System.out.println("Remaining amount : " + f);
sc.close();
	}

}
