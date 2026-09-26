package com.Projects;

public class HomeLoan extends Loanimpl {

	void getHomeLoanDocs() {
		System.out.println("All Documents verified Successfully for Home Loan");
	}

	@Override
	public double getLoanROI() {
		double ROI = 6.5;
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

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan();
		double salary = hl.getSalary();
		int age = hl.getAge();
		int cibil = hl.getCibil();
		double ROI = hl.getLoanROI();
		if (salary >= 600000 && age >= 24 && cibil >= 300 && cibil <= 900) {
			System.out.println("Your interest rate : " + ROI + "%");
			System.out.println("Basics information is validated , Enter Personal Details : ");
		} else {
			System.out.println("Home Loan Rejected");
			return;
		}
		if (hl.isPhoneValid() && hl.isAadharValid() && hl.isPanValid()) {
			System.out.println("Personal details verified , Home Loan got approved");
			hl.getHomeLoanDocs();
			double loanAmount = hl.getLoanAmount();
			int years = hl.getTenure();
			double emi = hl.calculateEMI(loanAmount, years, ROI);
			double totalPayment = hl.totalPayment(emi, years);
			double totalInterest = hl.totalInterest(totalPayment, loanAmount);
			System.out.println("Loan Amount : " + loanAmount);
			System.out.println("Interest Rate  : " + ROI + "%");
			System.out.println("Loan Tenure    : " + years + " Years");
			System.out.printf("Monthly EMI     : %.2f%n", emi);
			System.out.printf("Total Interest  : %.2f%n", totalInterest);
			System.out.printf("Total Payment   : %.2f%n", totalPayment);
		} else {
			System.out.println("Home Loan Rejected - Invalid Details");
		}

	}
}