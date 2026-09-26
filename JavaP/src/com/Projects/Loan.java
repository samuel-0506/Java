package com.Projects;

public interface Loan {
	double getSalary();

	int getAge();

	int getCibil();

	double getLoanROI();

	boolean isPhoneValid();

	boolean isAadharValid();

	boolean isPanValid();

	double getLoanAmount();

	int getTenure();

	double calculateEMI(double loanAmount, int years, double ROI);

	double totalPayment(double emi, int years);

	double totalInterest(double totalPayment, double loanAmount);

	double goldWeight();

	double goldPrice();

	double goldValue(double weight, double price);

	double goldLoanAmount(double value);
}
