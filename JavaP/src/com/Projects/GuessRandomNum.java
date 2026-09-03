package com.Projects;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// int number =(int)( Math.random()*10)+1;

		Random r = new Random();
		int number = r.nextInt(0, 101);
		String yn;
		System.out.println(number);

		int count = 0;

		do {
			
			while (count < 3) {

				System.out.print("Enter Number : ");
				int n = sc.nextInt();
				if (n == number) {
					System.out.println("Congrats You Won !!!!");
					break;
				}
				else if (n < number) {
					System.out.println("Too Low");
				} else if (n > number) {
					System.out.println("Too High");
				}
				count++;
				if (count < 3) {
					System.out.println("Try Again");
				} else {
					System.out.println(" ");
					System.out.println("You Lost!!");
					System.out.println("Better luck next time");
				}
			}
			System.out.println(" ");
			System.out.println("Do you want to Continue...? Y for yes, N for No");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("Y")); {
			System.out.println("EXIT");
		}

	}

}
