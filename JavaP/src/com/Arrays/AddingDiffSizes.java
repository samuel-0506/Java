package com.Arrays;

import java.util.Arrays;

public class AddingDiffSizes {

	public static void main(String[] args) {
		int[] a1= {10,20,5,20,56};
		int[] a2= {5,8,5};
		
		int max=(a1.length>a2.length)?a1.length:a2.length;
		int [] sum=new int[max];
		
		for(int i=0;i<max;i++) {
			
			if(i<a1.length) {
				sum[i]=sum[i]+a1[i];
						}
			if(i<a2.length) {
				sum[i]=sum[i]+a2[i];
			}
		}
		System.out.println(Arrays.toString(sum));

	}

}
