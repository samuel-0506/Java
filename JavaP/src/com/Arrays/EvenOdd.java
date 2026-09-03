package com.Arrays;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				System.out.println("even " + arr[i]+" ");
			}else if(arr[i]%2!=0) {
				System.out.println("odd "+ arr[i]+" ");
			}
		}

	}

}
