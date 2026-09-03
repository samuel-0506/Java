package com.Inheritance;


class Employee {

	public double calculateSalary() {
		double salary=50000;
		System.out.println("Salary " +salary);
		return salary;
	}
	
	public double calculateSalary(double bonus) {
		double totalSalary=calculateSalary()+bonus;
		return totalSalary;
	}
}
public class Developer extends Employee{
	
	public double calculateSalary() {
		double salary=75000;
		return salary;
	}
	public double calculateSalary(double bonus) {
		double totalSalary=calculateSalary()+bonus;
		return totalSalary;
	}
	
	public static void main(String[] args) {
		Employee d = new Developer();
		double totalSalary=d.calculateSalary(10000);
		System.out.println("Total Salary : " + totalSalary);
	}
	
}

