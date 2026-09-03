package com.LoopsPractice;

import java.util.Scanner;

public class Nums {
	
	static void print(int a , int b ) {
		for(int i =a;i<=b;i++) {
		System.out.print(i + " ");
	}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Num Range : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		print(a,b); 
	}

}
