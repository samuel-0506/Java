package com.javaconstructors;

public class Chaining2 {
	int x;
	int y;
	String s;

	Chaining2() {
		this(20);
		System.out.println("A");
	}

	Chaining2(int x) {
		this(20, 30);
		System.out.println("B");
	}

	Chaining2(int x, int y) {
		this(20, 30, "Samuel");
		System.out.println("C");
	}

	Chaining2(int x, int y, String s) {
		this.x=x;
		this.y=y;
		this.s=s;
		System.out.println("D");
	}

	public static void main(String[] args) {
		Chaining2 c = new Chaining2();
		c.show();

	}

	void show() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);

	}
}
