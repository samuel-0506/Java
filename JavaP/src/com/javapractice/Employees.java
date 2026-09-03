package com.javapractice;

public class Employees {
	Integer EmpNo=101;
	String EName="samuel";
	Integer Salary=5000;
	String HireDate="15-04-2005";
	String Experience="5 years";
	Integer AnnSal;
	Integer AnnBonus;
	Integer TotalSal;
	
	{
		Integer AnnSal = Salary*12;
		Integer AnnBonus = AnnSal/10;
		Integer TotalSal = AnnSal+AnnBonus;
		  System.out.println("Emp No : " + EmpNo);
		  System.out.println("EName : " + EName);
		  System.out.println("HireDate : " + HireDate);
		  System.out.println("Experience : " + Experience);
		  System.out.println("AnnSal : " + AnnSal);
		  System.out.println("AnnBonus : " + AnnBonus);
		  System.out.println("TotalSal : " + TotalSal);

	}

	public static void main(String[] args) {
		Employees e1 = new Employees();
		

	}

}
