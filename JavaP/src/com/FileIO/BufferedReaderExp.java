package com.FileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExp {

	public static void main(String[] args) throws IOException {
		FileReader f = new FileReader("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel.txt");
		BufferedReader br = new BufferedReader(f);
		String s = br.readLine();
		while (s != null) {
			System.out.println(s);
			s=br.readLine();
		}

	}

}
