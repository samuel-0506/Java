package com.Loops;

import java.util.Scanner;

public class GivenRange {
	
	static void even(int n1,int n2) {
		for(int i=n1;i<=n2;i++) {
			if(i%2==0) {
			System.out.println(i);}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start Num : ");
		int n1=sc.nextInt();
		System.out.println("Enter End Num : ");
		int n2 = sc.nextInt();
		even(n1,n2);

	}

}
