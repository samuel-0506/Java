package com.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Movezeros {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Size : ");
		int size=sc.nextInt();
		int [] arr=new int[size];
//		int [] temp=new int[size];
		int index=0;
		System.out.print("Enter Elements : ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]!=0) {
//				temp[i-index]=arr[i];			
//			}else {
//				index+=1;
//			}
//			}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[index];
				arr[index]=arr[i];
				arr[i]=temp;
				index++;
			}
				
		}System.out.print(Arrays.toString(arr));
		}
	}
