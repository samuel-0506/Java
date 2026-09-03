package com.operators;

public class SwapwithXor {

	public static void main(String[] args) {
		int a = 40;
		int b=50;
		int c = a^b;
		System.out.println(c);
		a =c^a;
		b=c^b;
		System.out.println(a);
		System.out.println(b);

	}

}
