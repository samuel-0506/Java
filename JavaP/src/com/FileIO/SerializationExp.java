package com.FileIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	transient String name = "Samuel";
	int age= 22;
	String add="Rajam";
}

public class SerializationExp {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Employee emp = new Employee();
		
		File f = new File("C:\\Users\\samue\\OneDrive\\Desktop\\FileIo\\serilization.txt");
		FileOutputStream fos = new FileOutputStream(f);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		
	}

}
