package com.javapractice;

public class WithDrawl {
	int accountNo = 123456;
	double amount = 5000;
	
	//no arguments no return type

	void withdrawal() {
		System.out.println("Account Number: " + accountNo);
		System.out.println("Amount Withdrawn: Rs. " + amount);
	}

	public static void main(String[] args) {
		WithDrawl obj = new WithDrawl();
		obj.withdrawal();
	}
}