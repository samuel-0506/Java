package com.javapractice;

public class StudentInfo {
	int rollNumber = 032;
	String studentName = "Samuel";
	int age = 21;
	char gender = 'M';
	char section = 'A';
	int marks = 499;
	float percentage = 99.9f;
	boolean passStatus = true;
	char grade = 'A';

	void show() {
		System.out.println("Roll No : " + rollNumber);
		System.out.println("Name : " + studentName);
		System.out.println("Age : " + age);
		System.out.println("Gender : " + gender);
		System.out.println("Section : " + section);
		System.out.println("Marks : " + marks);
		System.out.println("Percentage : " + percentage);
		System.out.println("Grade : " + grade);

	}

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo();
		s1.show();
	}

}
