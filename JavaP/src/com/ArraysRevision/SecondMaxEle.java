package com.ArraysRevision;

import java.util.Scanner;

public class SecondMaxEle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		int max=arr[0];
		int max2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max2=max;
				max=arr[i];
			}if(arr[i]>max2 && arr[i]!=max) {
				max2=arr[i];
			}
		}
		System.out.println("Second Highest Element is : "+max2);
	}

}
