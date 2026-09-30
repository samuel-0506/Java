package com.FileIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader f = new FileReader("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel.txt");
		
		int r =f.read();
		
		while(r!= -1) {
			System.out.print((char)r);
			Thread.sleep(100);
			r=f.read();
		}
	}

}
