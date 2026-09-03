package com.Inheritance;
class Address{
	String city;
	Address(String city){
		this.city=city;
	}
	Address(Address ad){
		this.city= ad.city;
	}
}

public class DeepCopy {
	int id;
	String name;
	Address address;
	
	DeepCopy(int id){
		this.id=id;
		 
	}
	DeepCopy(DeepCopy dc){
		this.id=dc.id;
		this.address=new Address(dc.address);
	}
	public static void main(String[] args) {
		DeepCopy dc=new DeepCopy(1);	
		
	}
	@Override
	public String toString() {
		return "DeepCopy [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
