package com.Inheritance;

class Student implements Cloneable{
	int id ;
	String name;
	Address2 address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	Student(int id,String name,Address2 address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
}
class Address2{
	String city;

	public Address2(String city) {
		this.city = city;
	}
	
}

public class ShallowCopy {

	public static void main(String[] args) throws CloneNotSupportedException{
		Address2 a = new Address2("Hyd");
		Student s= new Student(101,"Samuel",a);
		Student s1=(Student) s.clone();
		s1.id=91;
		s1.name="lavanya";
		System.out.println("ID : "+s.id);
		System.out.println("Name : "+s.name);
		System.out.println("Address : "+s.address.city);
		System.out.println("ID : "+s1.id);
		System.out.println("Name : "+s1.name);
		System.out.println("Address : "+s1.address.city);

	}

}
