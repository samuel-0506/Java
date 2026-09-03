package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size: ");
		int size =sc.nextInt();
		int[] arr=new int[size];
		System.out.println("Enter Elements :");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int temp=0;
		int count=0;
		int count1=0;
		for(int i=0;i<arr.length-1;i++) {
			count++;
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					count1++;
				}
			}
		}System.out.println(Arrays.toString(arr));
		System.out.println(count);
		System.out.println(count1);
		sc.close();

	}

}
