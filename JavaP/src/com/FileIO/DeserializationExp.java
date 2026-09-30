package com.FileIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File f = new File("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\serilization.txt");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp = (Employee) ois.readObject();
		System.out.println(emp.name);
		System.out.println(emp.age);
		System.out.println(emp.add);
	}

}
