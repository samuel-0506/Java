package com.FileIO;

import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExp {

	public static void main(String[] args) throws IOException {
		try (PrintWriter pw = new PrintWriter("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel1.txt")) {
			pw.println('S');
			pw.println("Samuel Raju Lankalapalli");
			pw.println(26);
		}
	}

}
