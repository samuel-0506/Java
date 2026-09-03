package com.javaconstructors;

public class BankAccount {
	int accNumber;
	String holderName;
	double balance;
	double deposite;

	BankAccount(int accNumber, String holderName,double balance){
		this.accNumber=accNumber;
		this.holderName=holderName;
		this.balance=balance;
	}
	BankAccount(BankAccount b1,double deposite){
		this(b1.accNumber,b1.holderName,b1.balance);
		this.deposite=deposite;
	}

	public static void main(String[] args) {
		BankAccount b1=new BankAccount(563836483,"Samuel",76000.00);
		b1.show();
		BankAccount b2=new BankAccount(b1,5000.0);
		b2.show();
		b2.deposite();

	}
	void show() {
		System.out.println("Acc Number : "+ accNumber);
		System.out.println("Acc Holder Name : "+ holderName);
		System.out.println("Acc Balance : "+ balance);
		System.out.println("Dep money : " + deposite);
	
	}
	void deposite() {
		balance=balance+deposite;
		System.out.println("Total Balance : "+ balance);
	}

}
