package com.javaconstructors;

public class Student {
	int sid;
	String sname;

	Student() {
		
		System.out.println(sid);
		System.out.println(sname);

	}
	Student(int sid, String sname){
		this.sid = 101;
		this.sname = "Samuel";

	}

	public static void main(String[] args) {
		Student s = new Student();
		Student s2 = new Student(101,"samuel");
			System.out.println(s2.sid);
			System.out.println(s2.sname);

		}

	}


