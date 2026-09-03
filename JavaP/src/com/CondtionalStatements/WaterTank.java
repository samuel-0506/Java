package com.CondtionalStatements;
import java.util.Scanner;

public class WaterTank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Water Tank Level : ");
        int level = sc.nextInt();

        if (level < 0 || level > 100) {
            System.out.println("Invalid Water Level");
        }
        else if (level >= 80) {
            System.out.println("Tank Full");
        }
        else if (level >= 50) {
            System.out.println("Medium");
        } 
        else if (level >= 20) {
            System.out.println("Low");
        } else {
            System.out.println("Empty Soon");
        }

        sc.close();
    }
}
