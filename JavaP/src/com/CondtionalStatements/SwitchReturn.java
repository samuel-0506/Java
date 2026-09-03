package com.CondtionalStatements;

import java.util.Scanner;

public class SwitchReturn {
	
	static String login(int choice) {
		switch(choice) {
		case 1->{
			return "Admin login successful";			
		}
		case 2->{
			return "Student login successful";			
		}
		case 3->{
			return "Teacher login successful";			
		}
		default -> {
			return "Invalid User";
		}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select User");
		System.out.println("1. Admin");
		System.out.println("2. Student");
		System.out.println("3. Teacher");
		int choice = sc.nextInt();
		System.out.println(login(choice));
	}

}
