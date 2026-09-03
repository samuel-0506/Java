package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size =sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			int temp=0;
			for(int i=0;i<arr.length-1;i++) {
				boolean status=false;
				for(int j=0;j<arr.length-1-i;j++) {
					if(arr[j]>arr[j+1]) {
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
						status=true;
					}
				}
				if(!status) {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		

	}

}
