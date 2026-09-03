package com.CondtionalStatements;

import java.util.Scanner;

public class ATM2 {
	int pin=1234;
	double balance=68000;
	double dailyLimit=49000;
	double withdrawalAmount;
	static Scanner sc=new Scanner(System.in);
	String yn;
	int count=0;
	
	void withdraw(int enteredPin) {
		do {
		if(enteredPin==pin) {
			System.out.println("PIN verified !!");
			System.out.println("Enter WithDrawl Amount : ");
		    withdrawalAmount=sc.nextDouble();
			
			if(withdrawalAmount<=dailyLimit) {
				System.out.println("Daily Limit Verified  !!");
				
				if(withdrawalAmount<=balance) {
					System.out.println("Balance Verified");
					balance=balance-withdrawalAmount;
					dailyLimit-=withdrawalAmount;
					count++;
					
					System.out.println("Withdrawal Successful");
					System.out.println("Withdrawal Amount : "+ withdrawalAmount);
					System.out.println("Remaining Balance : "+ balance);
					System.out.println("Remaining Daily Limit : "+dailyLimit);
					
					if(count==2) {
						System.out.println("WithDrawl Limit condition reached");
						break;
					}
					
				}else {
					System.out.println("Insufficient Balance");
				}
			}else {
				System.out.println("Daily Limit Reached");
			}
		}else {
			System.out.println("Invalid PIN");
		}
		System.out.println("Do you want to Continue....?");
		yn=sc.next();
		}while(yn.equalsIgnoreCase("Y")); {
			System.out.println("Terminated");
		}
	}

	public static void main(String[] args) {
		ATM2 atm=new ATM2();
		System.out.println("Enter PIN : ");
		int enteredPin=sc.nextInt();
	    atm.withdraw(enteredPin);
		    
	}

}
