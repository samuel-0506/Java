package com.Inheritance;

class Employee3 {

	void calculateSalary(double salary) {
		System.out.println("Salary : " + salary);

	}
}

class Developer3 extends Employee3 {
	@Override
	void calculateSalary(double salary) {
		System.out.println("Developer Salary : " + salary);

	}
}

class Tester extends Employee3 {
	@Override
	void calculateSalary(double salary) {
		System.out.println("Tester Salary : " + salary);

	}
}

class Manager2 extends Employee3 {
	@Override
	void calculateSalary(double salary) {
		System.out.println("Manager Salary : " + salary);

	}
}

public class Inheritance {

	public static void main(String[] args) {
		Developer3 d = new Developer3();
		d.calculateSalary(50000);

		Tester t = new Tester();
		t.calculateSalary(40000);

		Manager2 m = new Manager2();
		m.calculateSalary(85000);

	}

}
