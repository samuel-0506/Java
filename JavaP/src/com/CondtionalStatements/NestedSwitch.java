package com.CondtionalStatements;

import java.util.Scanner;

public class NestedSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yn;
		
		do {
			System.out.println("Category");
			System.out.println("1. fruits");
			System.out.println("2. vegetables");
			int cat = sc.nextInt();
			
			switch(cat) {
			case 1 ->{
				System.out.println("Select fruits : ");
				System.out.println("1. Apple");
				System.out.println("2. Banana");
				System.out.println("3. Orange");
				int fruit=sc.nextInt();
				switch(fruit) {
				case 1 -> System.out.println("Apple price : 200/kg");
				case 2 -> System.out.println("Banana price : 50/dozen");
				case 3 -> System.out.println("Orange price : 100/kg");
				default -> System.out.println("invalid fruit");
				}}
			case 2 ->{
				System.out.println("Select vegetables : ");
				System.out.println("1. Tomato");
				System.out.println("2. Potato");
				System.out.println("3. Onion");
				int veg=sc.nextInt();
				switch(veg) {
				case 1 -> System.out.println("Tomato price : 20/kg");
				case 2 -> System.out.println("Potato price : 50/dozen");
				case 3 -> System.out.println("onion price : 10/kg");
				default -> System.out.println("invalid vegetable");	
				}
			}
			default -> System.out.println("invalid Category");
			}
			System.out.println("Do you want to continue ....? Y for yes ,N for no");
			yn=sc.next();
		}while(yn.equalsIgnoreCase("y"));
		System.out.println("Exit");

		sc.close();
	}
}
