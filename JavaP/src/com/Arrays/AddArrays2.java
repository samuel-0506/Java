package com.Arrays;

import java.util.Arrays;

public class AddArrays2 {

	public static void main(String[] args) {
		int [] a1= {13,56,34,78};
		int [] a2= {12,98,45,18};
		int [] sum=new int[a1.length];
		
		for(int i=0;i<a1.length;i++) {
			if(a1[i]>a2[i]) {
				sum[i]=a1[i]+a2[i];
			}else {
				sum[i]=a2[i];
			}
		}
		System.out.println(Arrays.toString(sum));

	}

}
