package com.javapractice;

public class MChaining {
	public static void meth1() {
		System.out.println("Good Morning");
		meth2();
	}

	public static void meth2() {
		System.out.println("Good AfterNoon");
		meth3();
	}

	public static void meth3() {
		System.out.println("Good Evening");
		MChaining m = new MChaining();
		m.meth4();
	}

	public static void main(String[] args) {
		System.out.println("Main method started !!");

		meth1();

	}

	void meth4() {
		System.out.println("Good moring 2");
		meth5();
	}

	void meth5() {
		System.out.println("Good Afternoon 2");
		meth6();
	}

	void meth6() {
		System.out.println("Good Evening 2");
	}

}
