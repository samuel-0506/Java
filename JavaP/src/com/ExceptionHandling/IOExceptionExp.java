package com.ExceptionHandling;

import java.io.File;
import java.io.IOException;

public class IOExceptionExp {

	public static void main(String[] args) throws IOException{
		System.out.println("Main method started");
		File f= new File("D:\\Javaaaa\\java.text");
		File f2= new File("D:\\Javaaaa\\java.pdf");
		
		f.createNewFile();
		f2.createNewFile();
		
		System.out.println("Main method Ended");

	}

}

