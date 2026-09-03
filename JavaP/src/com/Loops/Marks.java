package com.Loops;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		int correct = 0;
		int attempted=0;
		int incorrect=0;
		System.out.println("Enter the input of 20 Questions ");
		
		for(int i=1; i <= 20;i++) {
			System.out.println("Question "+ i +" : ");
			int ans=sc.nextInt();
			
			if(ans==1) {
				correct++;
				attempted++;
			}else if(ans==0) {
				incorrect++;
				attempted++;
			}else if(ans==-1) {
				
			}else {
				System.out.println("Enter valid inputs");
				i--;
			}
		}
		int marks=correct;
		double percentage=(marks/20)*100;
		System.out.println("************Results**************");
		System.out.println(" ");
		System.out.println("Correct Answers : "+correct);
		System.out.println("Incorrect Answers : "+incorrect);
		System.out.println("Questions Attempted : "+attempted);
		System.out.println("Total Marks : "+ marks);
		System.out.println("Total Percentage : "+percentage);
		sc.close();
	}
	

}
