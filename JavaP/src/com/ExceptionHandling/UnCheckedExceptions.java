package com.ExceptionHandling;

import java.util.Scanner;

public class UnCheckedExceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter first String as Num :");
			String str=sc.next();
			System.out.println("Enter second String as Num : ");
			String str2=sc.next();
			int n1=Integer.parseInt(str);
			int n2=Integer.parseInt(str2);
			int result=n1/n2;
			System.out.println("Results : "+result);
			int[] arr= {10,20,30,40};
			System.out.println("Enter an Index: ");
			int index=sc.nextInt();
			System.out.println("Element at index "+index+" is : "+arr[index]);
		}catch(NumberFormatException e) {
			e.printStackTrace();
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException ie) {
			ie.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Main Method Ended");

	}

}
