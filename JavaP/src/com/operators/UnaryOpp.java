package com.operators;

public class UnaryOpp {

	public static void main(String[] args) {
		int  a=10;
		int b=15;
		int c=18;
		int x =++a + --a - a++ - b-- + c-- + c++ + --b + b++;
		System.out.println(x);
		int y = c++ + --a + --b + --c - ++b + a + --c;
		System.out.println(y);
		System.out.println(a);
		System.out.println(a);
		System.out.println(a);

	}

}
