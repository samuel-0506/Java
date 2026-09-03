package com.CondtionalStatements;

import java.util.Scanner;

public class Recharge {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Recharge Plan : ");
		
		System.out.println("Enter Wallet balance : ");
		double wbal=sc.nextDouble();
		
		if(wbal>199) {
			System.out.println("please select Recharge plan");
			System.out.println("Enter Recharge plan");
			int plan=sc.nextInt();
			
			if(plan<wbal) {
				System.out.println("Plan Selected...!!");
				System.out.println("Recharge successful");
				System.out.println("Remaining wallet balance : "+ (wbal-plan));
			}else {
				System.out.println("Recharge failed");
			}
		}else {
			System.out.println("You don't Have Enough Balance");
		}

	}

}
