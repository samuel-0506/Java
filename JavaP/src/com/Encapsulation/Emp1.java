package com.Encapsulation;

public class Emp1 {

	public static void main(String[] args) {
		Emp e= new Emp();
		Emp e1= new Emp();
		Emp e2= new Emp();
		e.setSid(32);
		e.setSname("Samuel");
		e.setCourse("Java Full Stack");
		e.setMonths(6);
		e1.setSid(91);
		e1.setSname("Lavanya");
		e1.setCourse("Mern Full Stack");
		e1.setMonths(7);
		e2.setSid(32);
		e2.setSname("Sharmi");
		e2.setCourse("Python Full Stack");
		e2.setMonths(8);
		
		System.out.println("Student Id " +e.getSid());
		System.out.println("Student Name : "+e.getSname());
		System.out.println("Course : "+e.getCourse());
		System.out.println("Duration " +e.getMonths());
		System.out.println();
		System.out.println("Student Id " +e1.getSid());
		System.out.println("Student Name : "+e1.getSname());
		System.out.println("Course : "+e1.getCourse());
		System.out.println("Duration " +e1.getMonths());
		System.out.println();
		System.out.println("Student Id " +e2.getSid());
		System.out.println("Student Name : "+e2.getSname());
		System.out.println("Course : "+e2.getCourse());
		System.out.println("Duration " +e2.getMonths());

	}

}
