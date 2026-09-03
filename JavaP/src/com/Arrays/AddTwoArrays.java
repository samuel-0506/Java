package com.Arrays;

import java.util.Arrays;

public class AddTwoArrays {

	public static void main(String[] args) {
		int [] a1= {10,13,8,9};
		int [] a2= {11,2,5,7};
		int [] sum=new int[a1.length];
		
		for(int i=0;i<a1.length;i++) {
			sum[i]=a1[i]+a2[i];
		}
		System.out.println(Arrays.toString(sum));

	}

}
