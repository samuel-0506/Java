package com.ArraysRevision;

import java.util.Scanner;

public class CountPosNegZero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int [] arr=new int[size];
		System.out.println("Enter Elements : ");
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int posCount=0;
		int negCount=0;
		int zeroCount=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0) {
				posCount++;
			}else if(arr[i]<0) {
				negCount++;			
				}else {
					zeroCount++;
				}
		}
		System.out.println("Positive Numbers Count : "+posCount);
		System.out.println("Negative Numbers Count : "+negCount);
		System.out.println("Positive Numbers Count : "+zeroCount);
	}

}
