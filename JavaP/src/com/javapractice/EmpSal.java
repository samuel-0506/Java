package com.javapractice;

import java.util.Scanner;

public class EmpSal {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		EmpSal es = new EmpSal();
		System.out.println("Enter Jan Salary : ");
		int m1 = sc.nextInt();
		System.out.println("Enter Feb Salary : ");
		int m2 = sc.nextInt();
		System.out.println("Enter Mar Salary : ");
		int m3 = sc.nextInt();
		System.out.println("Enter Apr Salary : ");
		int m4 = sc.nextInt();
		System.out.println("Enter May Salary : ");
		int m5 = sc.nextInt();
		
		int TSal = es.totalSalary(m1,m2,m3,m4,m5);
		System.out.println("5 Months total salary : " + TSal);
		double avg = es.averageSalary(TSal);
		System.out.println("Average salary : " + avg );
		System.out.println("Annual salary : " + es.annualSalary(avg));

	}

	int totalSalary(int m1, int m2 , int m3, int m4, int m5) {
		int sum = m1+m2+m3+m4+m5;
		return sum;
	}

	double averageSalary(double a) {
		double b = a/5;
		return b;
	}

	double annualSalary(double y) {
		return y = y*12;
	}

}
