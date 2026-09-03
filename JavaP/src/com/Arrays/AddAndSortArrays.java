package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddAndSortArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int s1=sc.nextInt();
		int [] arr1=new int[s1];
		System.out.println("Enter Second Array Size :");
		int s2=sc.nextInt();
		int [] arr2=new int[s2];
		int [] arr3=new int[s1+s2];
		System.out.println("Enter First Arr elements : ");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter sec Arr elements : ");
		for(int i=0;i<arr2.length;i++) {
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
		}
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr3));
	
	int temp=0;
	for(int i=0;i<arr3.length-1;i++) {
		for(int j=0;j<arr3.length-1-i;i++) {
			if(arr3[j]>arr3[j+1]) {
				temp=arr3[j];
				arr3[j]=arr3[j+1];
				arr3[j+1]=temp;
			}
		}
	}
	System.out.println("After Sorting");
	System.out.println(Arrays.toString(arr3));
	}

}
