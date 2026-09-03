package com.javapractice;

public class WrapperExp {
	Integer num = Integer.parseInt("789000");
	int num2 = Integer.parseInt("65");
	Float f1 = Float.parseFloat("568.46f");
	Double d1 = Double.parseDouble("53.54");
	Boolean b1 = Boolean.parseBoolean("true");
	char[] c1 = Character.toChars(num2);

	public static void main(String[] args) {
		WrapperExp w1 = new WrapperExp();
		System.out.println(w1.num);
		System.out.println(w1.num2);
		System.out.println(w1.num + w1.num2);
		System.out.println(w1.f1);
		System.out.println(w1.d1);
		System.out.println(w1.b1);
		System.out.println(w1.c1);
	}

}
