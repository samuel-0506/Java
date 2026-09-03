package com.Patterns;

public class IncreasingNumbers {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {
			int num=1;
			for(int j=0;j<=i;j++) {
				System.out.print(num++ +" ");
			}
			System.out.println();
		}

	}

}
