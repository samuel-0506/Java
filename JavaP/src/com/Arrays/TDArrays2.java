package com.Arrays;

import java.util.Scanner;

public class TDArrays2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rows Count :");
		int row=sc.nextInt();
		System.out.print("Enter cols Count :");
		int col=sc.nextInt();
		
		String[][] arr=new String[row][col];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.next();
			}
		}
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
