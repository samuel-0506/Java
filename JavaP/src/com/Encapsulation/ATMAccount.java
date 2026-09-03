package com.Encapsulation;

import java.util.Scanner;

public class ATMAccount {
	static Scanner sc = new Scanner(System.in);
	private static double balance=49000;
	double amount;
	double withDamount;
	
	public void deposit(){
		System.out.println("Enter deposit Amount : ");
		amount=sc.nextDouble();
		if(amount>0) {
			System.out.println(amount +" deposited in your Account");
			balance=balance+amount;
		}else {
			System.out.println("Deposit valid amount");
		}
	}
	public void withdraw() {
		System.out.println("Enter Withdrawal Amount : ");
		withDamount=sc.nextDouble();
		if(withDamount < balance && withDamount>0) {
			System.out.println(withDamount +" Withdraw from your Account");
			balance=balance-withDamount;
		}else {
			System.out.println("Enter valid Amount");
		}
		
	}
	public void checkBalance() {
		System.out.println("Available Balance : "+balance);
	}
	

	public static void main(String[] args) {
		ATMAccount a = new ATMAccount();
		a.deposit();
		a.withdraw();
		a.checkBalance();

	}

}
