package com.Arrays;

public class SmallestNum {

	public static void main(String[] args) {
		int[] marks= {199,567,900,234,99};
		int small=marks[0];
		for(int i=0;i<marks.length;i++) {
			if(marks[i]<small) {
				small=marks[i];
			}
		}
		System.out.println("Smallest Number : "+small);

	}

}
