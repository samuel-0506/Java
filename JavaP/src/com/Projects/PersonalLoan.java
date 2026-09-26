package com.Projects;

public class PersonalLoan extends Loanimpl{
	void getPersonalLoanDocs() {
		System.out.println("All Documents verified successfully for Personal Loan");
	}
	
	@Override
	public double getLoanROI() {
		double ROI=8.5;
		int cibil=getCibil();
		if(cibil>=300 && cibil <=649) {
			System.out.println("(Poor to Doubtful): High risk of default; getting new credit is difficult.");
			ROI=ROI+5.0;
		}else if(cibil>=650 && cibil<=699) {
			System.out.println("(Fair/Satisfactory): Loan approval is possible, but lenders may charge higher interest rates.");
			ROI=ROI+2.0;
		}else if(cibil>=700 && cibil<=749) {
			System.out.println("(Good): Low risk; you qualify for most loans and credit cards.");
			ROI=ROI+1.0;
		}else if(cibil>=750 && cibil<=900) {
			System.out.println("(Excellent): Very high chance of loan approval with the lowest interest rates.");
			ROI=ROI+0.5;
		}
		return ROI;
	}
	
	public static void main(String[] args) {
		PersonalLoan pl = new PersonalLoan();
		double salary=pl.getSalary();
		int age=pl.getAge();
		int cibil=pl.getCibil();
		double ROI=pl.getLoanROI();
		if(salary>=900000 && age >=26 && cibil>=300 && cibil<=900) {
			System.out.println("Basic Information is validated, Enter personal details : ");
			System.out.println("Your interest rate : " +ROI+"%");
		}else {
			System.out.println("Personal Loan Rejected");
			return;
			
		}
		if(pl.isPhoneValid() && pl.isAadharValid() && pl.isPanValid()) {
			System.out.println("Personal details verified Successfully and Personal Loan got approved");
			pl.getPersonalLoanDocs();
			double loanAmount = pl.getLoanAmount();
			int years = pl.getTenure();
			double emi = pl.calculateEMI(loanAmount, years, ROI);
			double totalPayment = pl.totalPayment(emi, years);
			double totalInterest = pl.totalInterest(totalPayment, loanAmount);
			System.out.println("Loan Amount : " + loanAmount);
			System.out.println("Interest Rate  : " + ROI + "%");
			System.out.println("Loan Tenure    : " + years + " Years");
			System.out.printf("Monthly EMI     : %.2f%n", emi);
			System.out.printf("Total Interest  : %.2f%n", totalInterest);
			System.out.printf("Total Payment   : %.2f%n", totalPayment);
		}else {
			System.out.println("Personal Loan Rejected - Invalid Details");
		}
		pl.getPersonalLoanDocs();
		}

	}


