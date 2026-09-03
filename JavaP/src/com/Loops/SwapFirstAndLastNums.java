package com.Loops;
import java.util.Scanner;

public class SwapFirstAndLastNums {
	
	static void swap(int n) {
		int original =n;
		int last=n%10;
		int count=0;
		int temp=n;
		while(temp>0) {
			count++;
			temp=temp/10;
		}
		int power=1;
		for(int i=1;i<count;i++) {
			power=power*10;
		}
		temp=n;
		while(temp>=10) {
			temp=temp/10;
		}
		int first=temp;
		int middle=(n%power)/10;
		int results=(last*power)+(middle*10)+first;
		System.out.println("Original Number : "+original);
		System.out.println("After Swap Number : "+results);
			
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int n = sc.nextInt();
		swap(n);
sc.close();
	}

}
