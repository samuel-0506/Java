package com.CondtionalStatements;

import java.util.Scanner;

public class Recharge2 {
	double walBalance=6000;
	int rechargeAmount;
	static Scanner sc= new Scanner(System.in);
	
	void recharge(int rechargeplan) {
		if(rechargeplan == 199 || rechargeplan == 299 || rechargeplan == 349 || rechargeplan == 699 || rechargeplan == 899) {
			System.out.println("Recharge Plan Verified !!");
			rechargeAmount=rechargeplan;
			
			if(walBalance>=rechargeAmount) {
				System.out.println("Recharge Successful");
				walBalance-=rechargeAmount;
				System.out.println("Recharge Amount : "+rechargeAmount);
				System.out.println("Remaining wallet Balance : "+ walBalance);
			}else {
				System.out.println("Insufficient funds");
			}
		}else {
			System.out.println("Choose correct plan");
		}
	}

	public static void main(String[] args) {
		Recharge2 rec= new Recharge2();
		System.out.println("Enter Recharge plan ");
		int rechargeplan=sc.nextInt();
		rec.recharge(rechargeplan);
		System.out.println("Enter Recharge plan 2 ");
		rechargeplan=sc.nextInt();
		rec.recharge(rechargeplan);


	}

}
