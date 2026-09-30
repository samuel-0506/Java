package com.FileIO;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExp {

	public static void main(String[] args) throws IOException {

		FileWriter f = new FileWriter("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel.txt");

		f.write("Hii Everyone\n");
		f.write("I'm Samuel from rajam\n");
		f.write("Hope everyone doing well\n");
		f.close();
		System.out.println("Data Updated Successfully");
	}

}
