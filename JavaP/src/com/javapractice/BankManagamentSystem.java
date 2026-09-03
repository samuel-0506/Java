package com.javapractice;

public class BankManagamentSystem {
	static int AccNum = 1000;
	String CName;
	int AccBalance;
	 {
		AccNum ++;
	}
	void details() {
		System.out.println("AccNum : " + AccNum);
		System.out.println("Customer Name : "+CName);
		System.out.println("AccBalance : "+ AccBalance);
		System.out.println("");
		
		
	}
	
	public static void main(String[] args) {
		BankManagamentSystem C1 = new BankManagamentSystem();
		C1.CName = "Samuel";
		C1.AccBalance = 100000;
		C1.details();

		BankManagamentSystem C2 = new BankManagamentSystem();
		C2.CName = "Raju";
		C2.AccBalance = 240000;
		C2.details();


		BankManagamentSystem C3 = new BankManagamentSystem();
		C3.CName = "Surya";
		C3.AccBalance = 134000;
		C3.details();

		BankManagamentSystem C4 = new BankManagamentSystem();
		C4.CName = "SRV";
		C4.AccBalance = 340000;
		C4.details();
			
			

	}}
