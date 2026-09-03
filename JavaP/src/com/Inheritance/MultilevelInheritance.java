package com.Inheritance;

class Person{
	String name;
	int age;
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class Employee23 extends Person{
	int id;
	double salary;
	void display2() {
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
	}
}
class Manager extends Employee23{
	String department;
	void display3() {
		System.out.println("Department : "+ department);
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		Manager m = new Manager();
		m.name="Samuel";
		m.age=22;
		m.salary=56000;
		m.id=32;
		m.department="IT";
		m.display();
		m.display2();
		m.display3();

	}

}
