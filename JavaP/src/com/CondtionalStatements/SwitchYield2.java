package com.CondtionalStatements;

import java.util.Scanner;

public class SwitchYield2 {
	static String yn;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter First Num : ");
			int num1 = sc.nextInt();
			System.out.println("Enter Second Num : ");
			int num2 = sc.nextInt();
			System.out.println("Choose Operator");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");
			int syn =sc.nextInt();
			
			int result=switch(syn) {
			case 1->{
				System.out.println("Addition of Two nums : ");
				yield num1+num2;
			}
			case 2->{
				System.out.println("Subtraction of Two nums : ");
				yield num1-num2;
			}
			case 3->{
				System.out.println("Multiplication of Two nums : ");
				yield num1*num2;
			}
			case 4->{
				if(num2 != 0) {
				System.out.println("Division of Two nums : ");
				yield num1/num2;
			}else {
				System.out.println("Division is not possible with zero ");
				yield 0;
			}}
			case 5->{
				System.out.println("Modulus of Two nums : ");
				yield num1%num2;
			}
			default ->{
				System.out.println("Invalid symbol");
				yield 0;
			}
			};
			System.out.println("Results : "+result);
			System.out.println("");
			System.out.println("Do you want to continue ...? Y for Yes ,N for NO");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("Y"));
		System.out.println("Exit");

	}

}
