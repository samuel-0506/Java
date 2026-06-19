package com.javapractice;

public class EmpMeth {
//	int eId;
//	String eName;
//	int sal;
//	String dep ;
	static String org="Vcube software solutions";
	

	EmpMeth(){
		System.out.println("Emp Details");
		System.out.println("Org : " + EmpMeth.org);
		System.out.println(" ");
	}
	public void Emp(int eId, String eName, int sal, String dep) {
		System.out.println("Emp Id : "+ eId);
		System.out.println("Emp Name : "+ eName);
		System.out.println("Emp Salary : "+ sal);
		System.out.println("Emp Dept : "+ dep);
		System.out.println(" ");
			}
	public static void main(String[] args) {
		EmpMeth m = new EmpMeth();
		m.Emp(1,"Samuel", 60000, "IT");
		m.Emp(2,"Chanukya", 66000, "IT");
		m.Emp(3,"Brijesh", 70000, "IT");
		
	}

}
