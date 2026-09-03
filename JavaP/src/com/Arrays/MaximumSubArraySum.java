package com.Arrays;

import java.util.Scanner;

public class MaximumSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int max=arr[0];
		int sum=arr[0];
		for(int i=1;i<arr.length;i++) {
			sum=Math.max(sum+arr[i],arr[i]);
			max=Math.max(sum, max);
		}
		System.out.println(max);

	}

}
