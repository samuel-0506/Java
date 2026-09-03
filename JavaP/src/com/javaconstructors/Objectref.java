package com.javaconstructors;

class Samuel {
	String name;
	int age;
	String gfName;



Samuel(String name,int age, String gfName){
	this.name = name;
	this.age=age;
	this.gfName=gfName;
	
}}
class Samuel2{
	void show(Samuel s) {
		System.out.println("Name of Student : " + s.name);
		System.out.println("Age : " + s.age);
		System.out.println("Girl Frieend : " + s.gfName);
	}
	
}
public class Objectref {

	public static void main(String[] args) {
		Samuel s = new Samuel("Samuel",22,"Lav");
		Samuel2 s2 = new Samuel2();
		s2.show(s);

	}

}
