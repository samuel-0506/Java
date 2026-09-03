package com.javapractice;

public class Deposit {
	
	double balance = 6000;
	
	void totalBalance(double amount) {
		double totalBalance = balance + amount;
		System.out.println("Deposit money : "+ amount);
		System.out.println("Total Balance : " + totalBalance);
	}

	public static void main(String[] args) {
		Deposit d1 = new Deposit();
		d1.totalBalance(4000);

	}

}
