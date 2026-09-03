package com.Patterns;

import java.util.Scanner;

public class InvertedPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N Value : ");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--) {
			for(int j=n-i;j>0;j--) {
				System.out.print(" ");
			}
			for(int j=1;j<=i*2-1;j++) {
				System.out.print("*");
		}
			System.out.println();

	}
		sc.close();

}}
