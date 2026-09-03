package com.ArraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayzSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i =0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Sum of Array : "+sum);
	}

}
