package com.Projects;

import java.util.Scanner;

public class Loanimpl implements Loan {
	static Scanner sc = new Scanner(System.in);

	@Override
	public double getLoanROI() {
		double ROI = 8.5;
		int cibil = getCibil();
		if (cibil >= 300 && cibil <= 649) {
			System.out.println("(Poor to Doubtful): High risk of default; getting new credit is difficult.");
			ROI = ROI + 5.0;
		} else if (cibil >= 650 && cibil <= 699) {
			System.out.println(
					"(Fair/Satisfactory): Loan approval is possible, but lenders may charge higher interest rates.");
			ROI = ROI + 2.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("(Good): Low risk; you qualify for most loans and credit cards.");
			ROI = ROI + 1.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("(Excellent): Very high chance of loan approval with the lowest interest rates.");
			ROI = ROI + 0.5;
		}
		return ROI;
	}

	@Override
	public double getSalary() {
		System.out.println("Enter Salary : ");
		double salary = sc.nextDouble();
		return salary;
	}

	@Override
	public int getAge() {
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		return age;
	}

	@Override
	public int getCibil() {
		System.out.println("Enter Your Cibil score : ");
		int cibil = sc.nextInt();
		return cibil;
	}

	@Override
	public boolean isPhoneValid() {
		System.out.println("Enter Phone Number : ");
		String number = sc.next();
		return number.matches("[6-9]{1}[0-9]{9}");
	}

	@Override
	public boolean isAadharValid() {
		System.out.println("Enter  your Aadhar number : ");
		String aadhar = sc.next();
		return aadhar.matches("[1-4]{1}[0-9]{11}");
	}

	@Override
	public boolean isPanValid() {
		System.out.println("Enter your PAN number : ");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}");
	}
	@Override
	public double getLoanAmount() {
		System.out.println("Enter Loan Amount : ");
		double loanAmount=sc.nextDouble();
		return loanAmount;
	}
	@Override
	public int getTenure() {
		System.out.println("Enter your Loan Tenure(years) : ");
		int years=sc.nextInt();
		return years;
	}
	@Override
	public double calculateEMI(double loanAmount, int years, double ROI) {
		double monthlyRate=ROI/12/100;
		int months=years*12;
		double emi=loanAmount*monthlyRate*Math.pow(1+monthlyRate, months)/(Math.pow(1+monthlyRate, months)-1);
		return emi;
		
	}
	@Override
	public double totalPayment(double emi,int years) {
		int months=years*12;
		double totalPayment=emi*months;
		return totalPayment;
	}
	@Override
	public double totalInterest(double totalPayment,double loanAmount) {
		double totalInterest=totalPayment-loanAmount;
		return totalInterest;
	}
	@Override
	public double goldWeight() {
		System.out.println("Enter Gold Weight : ");
		double weight=sc.nextDouble();
		return weight;
	}
	@Override
	public double goldPrice() {
		System.out.println("Enter Gold price per gram : ");
		double price=sc.nextDouble();
		return price;
	}
	@Override
	public double goldValue(double weight, double price) {
		double value =weight*price;
		return value;
	}
	@Override
	public double goldLoanAmount(double value) {
		double ltv=75;
		double loanAmount=value*ltv/100;
		return loanAmount;
	}
}
