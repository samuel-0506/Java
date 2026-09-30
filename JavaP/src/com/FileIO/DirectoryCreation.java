package com.FileIO;

import java.io.File;
import java.io.IOException;

public class DirectoryCreation {

	public static void main(String[] args) throws IOException {
		
		File f = new File("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo");
		f.mkdir();
		File f2 = new File(f,"samuel.txt");
		f2.createNewFile();
		System.out.println("File Created Successfully!!");
		System.out.println(f2.canExecute());
		System.out.println(f2.canRead());
		System.out.println(f2.canWrite());
		System.out.println(f2.getCanonicalPath());
		System.out.println(f2.getAbsolutePath());
		System.out.println(f2.getFreeSpace());
		System.out.println(f2.getTotalSpace());
		System.out.println(f2.getParentFile());
	}

}
