package com.javapractice;
import java.util.Scanner;

public class Bill {
	int fixedChar = 5;
	
	void calculateBill(String CustomerName, int units , double TotalBill) {
		System.out.println("Customer name : "+ CustomerName);
		System.out.println("Units Consumed : "+ units);
		System.out.println("Total Bill : "+ TotalBill );
	}

	public static void main(String[] args) {
		Bill c1 = new Bill();
		Scanner sc= new Scanner(System.in);
		System.out.println("Customer Name : ");
		String CustomerName = sc.nextLine();

		System.out.println("Enter units consumed : ");
		int units = sc.nextInt();
		double TotalBill = c1.fixedChar * units; 
		c1.calculateBill(CustomerName,units, TotalBill);

	}


}
