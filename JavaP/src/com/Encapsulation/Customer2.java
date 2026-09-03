package com.Encapsulation;

public class Customer2 {

	public static void main(String[] args) {
		Customer c=new Customer();
		c.setCustomerId(32);
		c.setName("Samuel");
		c.setEmail("samuellankalapalli143@gmail.com");
		c.setPhnNum(9121663315l);
		
		System.out.println("Customer id :"+c.getCustomerId());
		System.out.println("Name : "+c.getName());
		System.out.println("Email : "+c.getEmail());
		System.out.println("Phone Number : "+c.getPhnNum());

	}

}
