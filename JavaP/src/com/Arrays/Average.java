package com.Arrays;

public class Average {

	public static void main(String[] args) {
		int[] age= {10,20,30,40,50};
		int sum=0;
		int avg=0;
		for(int i=0;i<age.length;i++){
			sum=sum+age[i];
		}
		avg=sum/age.length;
		System.out.println("Average : " +avg);

	}

}
