package com.FileIO;

import java.io.File;
import java.io.IOException;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		File f = new File("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\samuel.pdf");
		if(!f.exists()) {
			f.createNewFile();
			System.out.println("File Created successfully");
		}else {
			System.out.println("Something went wrong ");
		}
	}

}
