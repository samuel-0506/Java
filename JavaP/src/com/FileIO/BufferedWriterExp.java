package com.FileIO;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExp {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel.txt",true);
		try (BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Java is Simple\n");
			bw.write("Java is Robust\n");
			bw.write("Java is Platform Independent\n");
			bw.flush();
		}
		System.out.println("File Updated successfully");
	}

}
