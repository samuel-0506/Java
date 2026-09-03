package com.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		int [] [] arr=new int[2][4];
		arr[0][0]=20;
		arr[0][1]=49;
		arr[0][2]=46;
		arr[0][3]=78;
		arr[1][0]=28;
		arr[1][1]=90;
		arr[1][2]=60;
		arr[1][3]=30;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println("");
		}
		for(int[] a1 : arr) {
			for(int a:a1) {
				System.out.print(a+" ");
			}
			System.out.println("");
		}

	}

}
