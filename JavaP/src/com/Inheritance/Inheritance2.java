package com.Inheritance;

class Course{
	void duration() {
		String duration="8 months";
		System.out.println("Duration : "+duration);
	}
}
class JavaCourse extends Course{
	void duration() {
		String duration="7 months";
		System.out.println("Java Duration : "+duration);
	}
}
class SqlCourse extends Course{
	void duration() {
		String duration="5 months";
		System.out.println("Sql Duration : "+duration);
	}
}
class PythonCourse extends Course{
	void duration() {
		String duration="6 months";
		System.out.println("Python Duration : "+duration);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		JavaCourse j = new JavaCourse();
		j.duration();
		SqlCourse s = new SqlCourse();
		s.duration();
		PythonCourse p = new PythonCourse();
		p.duration();
	}

}
