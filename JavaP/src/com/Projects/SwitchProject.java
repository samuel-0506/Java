package com.Projects;

import java.util.Scanner;

// ConsoleBasedProject1

public class SwitchProject {

    static double sum = 0;
    static double startersBill = 0;
    static double mainCourseBill = 0;
    static double dessertsBill = 0;
    static double drinksBill = 0;
    static String yn;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("******* WELCOME TO SAMUEL'S RESTAURANT ********");

        do {

            System.out.println("\nMenu");
            System.out.println("1. Starters");
            System.out.println("2. Main Course");
            System.out.println("3. Desserts");
            System.out.println("4. Drinks");

            int menu = sc.nextInt();

            switch (menu) {

            case 1 -> {
                System.out.println("Starters Menu:");
                System.out.println("1. Chicken Lollipops");
                System.out.println("2. Tandoori Chicken");
                System.out.println("3. Butter Chicken");
                System.out.println("4. Apollo Fish");

                int starters = sc.nextInt();

                switch (starters) {

                case 1 -> {
                    System.out.println("Chicken Lollipops Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    startersBill += 320 * quantity;
                    sum += 320 * quantity;
                }

                case 2 -> {
                    System.out.println("Tandoori Chicken Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    startersBill += 300 * quantity;
                    sum += 300 * quantity;
                }

                case 3 -> {
                    System.out.println("Butter Chicken Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    startersBill += 260 * quantity;
                    sum += 260 * quantity;
                }

                case 4 -> {
                    System.out.println("Apollo Fish Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    startersBill += 290 * quantity;
                    sum += 290 * quantity;
                }

                default -> System.out.println("Invalid Item");
                }
            }

            case 2 -> {

                System.out.println("Main Course:");
                System.out.println("1. Chicken Fry Piece Biryani");
                System.out.println("2. Chicken Dum Biryani");
                System.out.println("3. Mutton Biryani");
                System.out.println("4. Prawns Biryani");

                int mainCourse = sc.nextInt();

                switch (mainCourse) {

                case 1 -> {
                    System.out.println("Chicken Fry Piece Biryani Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    mainCourseBill += 240 * quantity;
                    sum += 240 * quantity;
                }

                case 2 -> {
                    System.out.println("Chicken Dum Biryani Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    mainCourseBill += 240 * quantity;
                    sum += 240 * quantity;
                }

                case 3 -> {
                    System.out.println("Mutton Biryani Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    mainCourseBill += 500 * quantity;
                    sum += 500 * quantity;
                }

                case 4 -> {
                    System.out.println("Prawns Biryani Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    mainCourseBill += 320 * quantity;
                    sum += 320 * quantity;
                }

                default -> System.out.println("Invalid Item");
                }
            }

            case 3 -> {

                System.out.println("Desserts Menu:");
                System.out.println("1. Gulab Jamun");
                System.out.println("2. Ice Cream");
                System.out.println("3. Brownie");
                System.out.println("4. Chocolate Cake");

                int desserts = sc.nextInt();

                switch (desserts) {

                case 1 -> {
                    System.out.println("Gulab Jamun Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    dessertsBill += 50 * quantity;
                    sum += 50 * quantity;
                }

                case 2 -> {
                    System.out.println("Ice Cream Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    dessertsBill += 60 * quantity;
                    sum += 60 * quantity;
                }

                case 3 -> {
                    System.out.println("Brownie Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    dessertsBill += 90 * quantity;
                    sum += 90 * quantity;
                }

                case 4 -> {
                    System.out.println("Chocolate Cake Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    dessertsBill += 120 * quantity;
                    sum += 120 * quantity;
                }

                default -> System.out.println("Invalid Item");
                }
            }

            case 4 -> {

                System.out.println("Drinks Menu:");
                System.out.println("1. Water");
                System.out.println("2. Coke");
                System.out.println("3. Sprite");
                System.out.println("4. Mango Juice");

                int drinks = sc.nextInt();

                switch (drinks) {

                case 1 -> {
                    System.out.println("Water Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    drinksBill += 30 * quantity;
                    sum += 30 * quantity;
                }

                case 2 -> {
                    System.out.println("Coke Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    drinksBill += 60 * quantity;
                    sum += 60 * quantity;
                }

                case 3 -> {
                    System.out.println("Sprite Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    drinksBill += 60 * quantity;
                    sum += 60 * quantity;
                }

                case 4 -> {
                    System.out.println("Mango Juice Added");
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();

                    drinksBill += 60 * quantity;
                    sum += 60 * quantity;
                }

                default -> System.out.println("Invalid Item");
                }
            }

            default -> System.out.println("Invalid Menu");

            }

            System.out.print("\nDo you want to order more? (Y/N): ");
            yn = sc.next();

        } while (yn.equalsIgnoreCase("Y"));

        System.out.println("\n==================================");
        System.out.println("        SAMUEL'S RESTAURANT");
        System.out.println("==================================");
        System.out.println("Starters Bill      : ₹" + startersBill);
        System.out.println("Main Course Bill   : ₹" + mainCourseBill);
        System.out.println("Desserts Bill      : ₹" + dessertsBill);
        System.out.println("Drinks Bill        : ₹" + drinksBill);
        System.out.println("----------------------------------");
        System.out.println("Total Bill         : ₹" + sum);
        System.out.println("==================================");
        System.out.println("Thank You! Visit Again.");

		sc.close();
	}
}