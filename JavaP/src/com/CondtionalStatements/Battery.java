package com.CondtionalStatements;

import java.util.Scanner;

public class Battery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Battery Percentage: ");
        int battery = sc.nextInt();

        if (battery < 0 || battery > 100) {
            System.out.println("Invalid Battery Level");
        } 
        else if (battery >= 80) {
            System.out.println("Fully Charged");
        }
        else if (battery >= 50) {
            System.out.println("Good");
        }
        else if (battery >= 20) {
            System.out.println("Low");
        } else {
            System.out.println("Critical");
        }

        sc.close();
    }
}