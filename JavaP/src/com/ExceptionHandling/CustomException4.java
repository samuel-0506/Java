package com.ExceptionHandling;

import java.util.Scanner;

class InvalidPercentageException extends Exception {

	    public InvalidPercentageException(String message) {
	        super(message);
	    }
	}

	public class CustomException4 {

	    static void checkPercentage(double percentage)
	            throws InvalidPercentageException {

	        if (percentage < 0 || percentage > 100) {
	            throw new InvalidPercentageException(
	                "Percentage must be between 0 and 100"
	            );
	        }

	        System.out.println("Valid Percentage");
	    }

	    public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);

	        try {
	        	System.out.println("Enter % : ");
	        	int per = sc.nextInt();
	            checkPercentage(per);
	        }
	        catch (InvalidPercentageException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}

