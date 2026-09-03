package com.Arrays;

public class Sum {

	public static void main(String[] args) {
		int[] age= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<age.length;i++){
			sum=sum+age[i];
		}
		System.out.println(sum);

	}

}
