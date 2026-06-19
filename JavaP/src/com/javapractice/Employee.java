package com.javapractice;

public class Employee {
	int empId;
	String eName;
	int salary;
	String dep;

	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId = 1;
		e.eName = "Samuel";
		e.salary = 50000;
		e.dep = "IT";
		System.out.println("Emp ID : " + e.empId + "\n" + "E Name : " + e.eName + "\n" + "Salary : " + e.salary + "\n"
				+ "Dep : " + e.dep);
		System.out.println(" ");
		Employee e2 = new Employee();
		e2.empId = 2;
		e2.eName = "Chanukya";
		e2.salary = 53000;
		e2.dep = "IT";
		System.out.println("Emp ID : " + e2.empId + "\n" + "E Name : " + e2.eName + "\n" + "Salary : " + e2.salary + "\n"
				+ "Dep : " + e2.dep);
		
	}

}
