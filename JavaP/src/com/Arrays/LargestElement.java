package com.Arrays;

public class LargestElement {

	public static void main(String[] args) {
		int[] ages = {10,30,80,46,99};
		int max=0;
		for(int i=0;i<ages.length;i++) {
			if(ages[i]>max) {
				max=ages[i];
			}
		}
		System.out.println(max);

	}

}
