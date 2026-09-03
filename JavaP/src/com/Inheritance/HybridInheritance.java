package com.Inheritance;
class Person3{
	String name;
	int age;
	void display() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}

class Employee2 extends Person3{
	int id;
	double salary;
	void display2() {
		System.out.println("ID : "+id);
		System.out.println("Salary : "+salary);
	}
}
class Manager1 extends Employee2{
	String department;
	void display3() {
		System.out.println("Department : "+ department);
	}
}
class Developer2 extends Employee2{
	String department;
	void display4() {
		System.out.println("Department : "+ department);
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		Manager1 m = new Manager1();
		m.name="Samuel";
		m.age=22;
		m.salary=56000;
		m.id=32;
		m.department="IT";
		m.display();
		m.display2();
		m.display3();
		System.out.println();
		Developer2 d = new Developer2();
		d.name="Lavanya";
		d.age=22;
		d.salary=70000;
		d.id=91;
		d.department="IT";
		d.display();
		d.display2();
		d.display4();
	}

}
