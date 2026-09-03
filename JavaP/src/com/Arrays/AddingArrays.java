package com.Arrays;

import java.util.Arrays;

public class AddingArrays {

	public static void main(String[] args) {
		int [] arr1= {12,13,14,15};
		int [] arr2= {16,17,18,19};
		int [] arr3=new int[arr1.length+arr2.length];
		for(int i =0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[arr1.length+i]=arr2[i];
			
		}
		System.out.println(Arrays.toString(arr3));


	}

}
