package com.Inheritance;

class Address1{
	String loc;
	
	 Address1(String loc){
		 this.loc=loc;
	 }
	 Address1(Address1 ad){
		 this.loc=ad.loc;
	 }
	@Override
	public String toString() {
		return "Address1 [loc=" + loc + "]";
	}
	 
}
public class DeepCopyEX {
	int id;
	String name;
	Address1 address;
	
	public DeepCopyEX(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	public DeepCopyEX(DeepCopyEX dc ) {
		super();
		this.id = dc.id;
		this.name =dc. name;
		this.address = new Address1(dc.address);
	}

	public static void main(String[] args) {
		Address1 ad=new Address1("hyd");
		DeepCopyEX dc=new DeepCopyEX(1,"h",ad);
		System.out.println(dc);
		ad.loc="KZt";
		DeepCopyEX dc1=new DeepCopyEX(dc);
		System.out.println(dc1);

	}
	@Override
	public String toString() {
		return "DeepCopyEX [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
