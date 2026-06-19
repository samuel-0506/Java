package com.javapractice;

public class TestDemo1 {

	public static void main(String[] args) throws ClassNotFoundException {
		System.out.println("Main method started");
		System.out.println("Good morning Guys");
		Class.forName("java.lang.String");
		Class.forName("java.lang.System");
		Class.forName("java.util.Scanner");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Main method ended");
	}

}
