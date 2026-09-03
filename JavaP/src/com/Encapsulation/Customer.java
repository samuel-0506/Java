package com.Encapsulation;

public class Customer {
	private int customerId;
	private String name;
	private long phnNum;
	private String email;

	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPhnNum(long phnNum) {
		if(phnNum<1000000000L && phnNum>9999999999L) {
			throw new IllegalArgumentException("Enter Valid Number : ");
		}
		this.phnNum = phnNum;
	}
	
	public long getPhnNum() {
		return phnNum;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
}
