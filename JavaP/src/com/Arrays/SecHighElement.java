package com.Arrays;

import java.util.Scanner;

public class SecHighElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int max2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max2 = max;
				max = arr[i]; // 5 6 7 8
			}else if(arr[i]>max2 && arr[i]<max) {
				max2=arr[i];
			}
	}
		System.out.println("Second Highest element : "+ max2);

	}

}
