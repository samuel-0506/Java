package com.Arrays;

import java.util.Scanner;

public class IfMaximumSubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		
		int sum=arr[0];
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			int sum2=sum+arr[i];
			if(sum2>arr[i]) {
				sum=sum2;
			}else {
				sum=arr[i];
			}
			if(max<sum) {
				max=sum;
			}
		}
		System.out.println(max);

	}

}
