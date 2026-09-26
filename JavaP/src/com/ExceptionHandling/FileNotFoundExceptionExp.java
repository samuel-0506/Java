package com.ExceptionHandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionExp {

	public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
		System.out.println("Main method started");

		File f = new File("D:\\Javaaaa\\self.txt");

		FileReader fr = new FileReader(f);
		int i = fr.read();
		System.out.println(i);

		while (i != -1) {
			System.out.print((char) i);
			Thread.sleep(100);
			i = fr.read();

		}
		System.out.println("Main method ended");

	}

}
