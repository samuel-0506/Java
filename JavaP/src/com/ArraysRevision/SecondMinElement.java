package com.ArraysRevision;

import java.util.Scanner;

public class SecondMinElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int min=arr[0];
		int min2=arr[1];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min2=min;
				min=arr[i];
			}
		}System.out.println("Second Min Element : "+ min2);
	}

}
