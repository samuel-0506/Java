package com.ArraysRevision;

import java.util.Arrays;
import java.util.Scanner;

public class MovesZerosToEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Array size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		int[]temp=new int[arr.length];

		System.out.println("Enter Elements : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				temp[i-count]=arr[i];
			}else {
				count++;
			}
		}
		System.out.println(Arrays.toString(temp));
		sc.close();
	}

}
