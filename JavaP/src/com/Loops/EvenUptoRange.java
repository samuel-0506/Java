package com.Loops;

import java.util.Scanner;

public class EvenUptoRange {
	
	static void range(int n) {
		for(int i =0;i<=n;i=i+2)
			System.out.print(i+" ");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		range(n);

	}

}
