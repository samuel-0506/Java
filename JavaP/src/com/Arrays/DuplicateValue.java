package com.Arrays;

import java.util.Scanner;

public class DuplicateValue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<size;i++) {
			boolean status=false;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					status=true;
					break;
				}				
			
			}
			if(status) {
				continue;
			}
			for(int k=i+1;k<size;k++) {
				if(arr[i]==arr[k]) {
					
					System.out.println("Duplicate value : "+arr[i]);
					break;
				}
			}
		}
}
}