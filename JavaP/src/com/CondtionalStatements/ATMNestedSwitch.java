package com.CondtionalStatements;

import java.util.Scanner;

public class ATMNestedSwitch {
	static int deposit;
	static int balance=50000;
	static int withdrawl;
	static String yn;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select Option");
		System.out.println("1. Savings");
		System.out.println("2. Current");
		int opt=sc.nextInt();
		
		
		do {
			switch(opt) {
			case 1 ->{
				System.out.println("Select option");
				System.out.println("1. Check Balance");
				System.out.println("2. WithDraw");
				System.out.println("3. Deposit");
				int opt2=sc.nextInt();
				switch(opt2) {
				case 1->System.out.println("Your Balance is : "+(balance-withdrawl));
				case 2->{
					withdrawl=sc.nextInt();
					System.out.println("Withdrawl Amount : " + withdrawl);
				}
				case 3->{
					deposit=sc.nextInt();
					System.out.println("Deposit Amount : " + deposit);}
				default -> System.out.println("Invalid Entry");
				}
			
			}
			case 2 ->{
				System.out.println("Select option");
				System.out.println("1. Check Balance");
				System.out.println("2. WithDraw");
				System.out.println("3. Mini Statement");
				int opt3=sc.nextInt();
				switch(opt3) {
				case 1->System.out.println("Your Balance is : "+balance);
				case 2->System.out.println("Withdrawl Amount : " + withdrawl);
				case 3->System.out.println("Mini Statement -> Remaing Bal : "+ (balance-withdrawl));
				default -> System.out.println("Invalid Entry");
				}
			}}
			System.out.println("Do you want to continue ...? Y for Yes and N for No");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		
		

	}

}
