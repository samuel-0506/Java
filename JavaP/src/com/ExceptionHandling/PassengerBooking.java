package com.ExceptionHandling;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PassengerBooking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter Passenger Id as Number : ");
			String pId = sc.next();
			System.out.println("Enter Passenger Age as Number : ");
			String pAge = sc.next();
			System.out.println("Enter Passenger Seat Number : ");
			String pSeatNo = sc.next();
			int id = Integer.parseInt(pId);
			System.out.println("Passenger ID : " + id);
			int age = Integer.parseInt(pAge);
			System.out.println("Passenger Age : " + age);
			int seatNo = Integer.parseInt(pSeatNo);
			System.out.println("Passenger Seat Number : " + seatNo);
		} catch (NumberFormatException e) {
			System.err.println(e.toString());
		}
		try {
			System.out.println("Enter Passenger Name : ");
			String[] passenger = new String[5];
			for (int i = 0; i < passenger.length; i++) {
				passenger[i] = sc.next();
			}
			System.out.println("Enter index for pass Name : ");
			int index = sc.nextInt();
			System.out.println("Passenger Name : " + passenger[index]);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.err.println(aie.getMessage());
		}
		try {
			Object[][] passData = new Object[4][3];
			System.out.println("Enter Passenger Details : ");

			for (int i = 0; i < passData.length; i++) {
				System.out.println("Enter Name : ");
				passData[i][0] = sc.next();
				System.out.println("Enter Age : ");
				passData[i][1] = sc.nextInt();
				System.out.println("Enter Seat Num : ");
				passData[i][2] = sc.next();
			}

			System.out.println(Arrays.deepToString(passData));
			System.out.println("Enter index for passData : ");
			int index = sc.nextInt();
			System.out.println("Passenger Details : ");
			System.out.println("Passenger Name : " + passData[index][0]);
			System.out.println("Passenger Age : " + passData[index][1]);
			System.out.println("Passenger Seat No : " + passData[index][2]);
		} catch (ArrayIndexOutOfBoundsException ai) {
			System.err.println(ai.toString());
		} catch (InputMismatchException ie) {
			System.out.println(ie.toString());
		}
	}

}
