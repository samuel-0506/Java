package com.ArraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter Rotations : ");
		int r=sc.nextInt();
		arrayRotation(arr,r);
		System.out.println(Arrays.toString(arr));
	}

	static void arrayRotation(int[] arr,int r) {
		int start=0;
		int end=arr.length-1;
		r=r%arr.length;
		arrayReverse(arr,start,end);
		arrayReverse(arr,start,r-1);
		arrayReverse(arr,r,end);
	}

	static void arrayReverse(int[] arr, int start, int end) {
		int temp=0;
		while(start<end) {
			temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}

}
