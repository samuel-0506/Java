package com.Arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter req Element : ");
		int target =sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				System.out.println("Index at : "+i);
			}
		}
		sc.close();
	}

}
