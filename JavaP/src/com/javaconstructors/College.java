package com.javaconstructors;

public class College {
	String clgName;
	String city;
	int noOfStudents;
	
	College(){
		this("SIR C R R College");
	}
	College(String clgName){
		this(clgName,"Eluru");
	}
	College(String clgName,String city){
		this(clgName,city,1233);
	}
College(String clgName,String city,int noOfStudents){
		this.clgName=clgName;
		this.city=city;
		this.noOfStudents=noOfStudents;
	}
	

	public static void main(String[] args) {
		College c = new College();
		c.show();
		
	}
	void show() {
		System.out.println("Clg Name : "+ clgName);
		System.out.println("City  : "+ city);
		System.out.println("No of Students : "+ noOfStudents);
	}

}
