package com.Projects;

public class GoldLoan extends Loanimpl{
	
	void getGoldLoanDocs() {
		System.out.println("Gold loan documents verified successfully ");
	}
	
	@Override
	public double getLoanROI() {
		double ROI = 8.0;
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
		GoldLoan gl= new GoldLoan();
		double salary=gl.getSalary();
		int age=gl.getAge();
		int cibil = gl.getCibil();
	    double ROI = gl.getLoanROI();
	    if(salary>=250000 && age >=21 && cibil>=300 && cibil<=900) {
	    	System.out.println("Basic Information is validated, Enter personal details : ");
			System.out.println("Your interest rate : " +ROI+"%");
		}else {
			System.out.println("Gold Loan Rejected");
			return;
	    }
	    if(gl.isPhoneValid() && gl.isAadharValid() && gl.isPanValid()) {
	    	System.out.println("Personal details verified successfully");
	    	gl.getGoldLoanDocs();
	    	double weight=gl.goldWeight();
	    	double price=gl.goldPrice();
	    	double goldValue=gl.goldValue(weight, price);
	    	double loanAmount=gl.goldLoanAmount(goldValue);
	    	int years=gl.getTenure();
	    	double emi=gl.calculateEMI(loanAmount, years, ROI);
	    	double totalPayment=gl.totalPayment(emi, years);
	    	double totalInterest=gl.totalInterest(totalPayment, loanAmount);
	    	System.out.println("Gold Weight   : " + weight + " grams");
	        System.out.printf("Gold Value    : %.2f%n", goldValue);
	        System.out.printf("Loan Amount   : %.2f%n", loanAmount);
	        System.out.printf("Interest Rate : %.2f%%%n", ROI);
	        System.out.println("Loan Tenure   : " + years + " Years");
	        System.out.printf("Monthly EMI   : %.2f%n", emi);
	        System.out.printf("Total Interest: %.2f%n", totalInterest);
	        System.out.printf("Total Payment : %.2f%n", totalPayment);
	    }else {
	    	System.out.println("Gold loan Rejected");
	    }

	}

}
