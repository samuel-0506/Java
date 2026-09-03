package com.LoopsPractice;

import java.util.Scanner;

public class NthPrime {
	
	static boolean isPrime(int n) {
		boolean status =true;
		if(n<=1) {
			return false;
		}
		for(int i=2;i<n;i++) {
			if(n%i==0){
				return false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers : ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		System.out.println("Enter the Position you want");
		int count=0;
		int nth = sc.nextInt();
		for(int i =n1;i<=n2;i++) {
			if(isPrime(i)) {
				count++;
				if(count==nth) {
					System.out.println(i);
				}
			}
		}

	}

}
