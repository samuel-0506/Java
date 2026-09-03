package com.javapractice;

public class MobileRecharge {
	
	String name = "Unlimited 299";
	String val = "28 Days";
	String data = "!.5 GB/Day";
	String calls = "Unlimited";

	void showPlanDetails() {
		System.out.println("Current Recharge plan ");
		System.out.println("Plan Name : "+ name);
		System.out.println("Validity : "+ val);
		System.out.println("Data : " + data);
		System.out.println("Calls : "+ calls);
		System.out.println(" ");
	}
	
	void recharge(double amount) {
		System.out.println("Recharge Successfull!");
		System.out.println("Recharge amount : "+ amount);
	}

	public static void main(String[] args) {
		MobileRecharge mr = new MobileRecharge();
		mr.showPlanDetails();
		mr.recharge(299);

	}

}
