package com.Patterns;

public class ReverseRight {

	public static void main(String[] args) {
		
		for(int i=1;i<=6;i++) {
			for(int j=5;j>=i;j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
