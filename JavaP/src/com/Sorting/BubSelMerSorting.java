package com.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubSelMerSorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size : ");
		int size = sc.nextInt();
		int [] arr =  new int[size];
		System.out.println("Enter Elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		//Bubble Sorting
//		bubbleSorting(arr);
		//Selection Sorting
//		selectionSorting(arr);
		//Merge Sorting
		mergeSorting(arr);
		

	}
	//Bubble Sorting
	static void bubbleSorting(int[] arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("After Sorting : " +Arrays.toString(arr));
	}
	
	//Selection Sorting
	static void selectionSorting(int[]arr) {
		int temp=0;
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		System.out.println("After Sorting : " + Arrays.toString(arr));
	}
	
	static void mergeSorting(int[]arr) {
		divide(arr);
		System.out.println("After Sorting : "+ Arrays.toString(arr));
	} 
	static void divide(int [] arr) {
		if(arr.length<=1) {
			return;
		}
		int [] left=new int[arr.length/2];
		int [] right=new int[arr.length-left.length];
		
		int i;
		for(i=0;i<left.length;i++) {
			left[i]=arr[i];
		}
		for(int j=0;j<right.length;j++) {
			right[j]=arr[i];
			i++;
		}
		divide(left);
		divide(right);
		merging(arr,left,right);
		
	}
	static void merging(int []arr,int [] left,int[]right) {
		int i=0;
		int j=0;
		int k=0;
		
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				arr[k++]=left[i++];
			}else {
				arr[k++]=right[j++];
			}
		}
		while(i<left.length) {
			arr[k++]=left[i++];
		}
		while(j<right.length) {
			arr[k++]=right[j++];
		}
	}
	

}
