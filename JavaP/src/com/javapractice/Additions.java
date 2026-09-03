package com.javapractice;

public class Additions {
	int a;
	int b;
	float a1;
	float a2;
	double a3;
	double a4;

	int addint(int a, int b) {
		int sum = a + b;
		return sum;
	}

	float addfloat(float a1, float a2) {
		float sum = a1 + a2;
		return sum;

	}

	double addDouble(double a3, double b4) {
		double sum = a3 + a4;
		return sum;

	}

	public static void main(String[] args) {
		Additions t1 = new Additions();
		System.out.println(t1.addint(30,50));
		
		Additions t2 = new Additions();
		System.out.println(t2.addfloat(30.4f,40.5f));

		Additions t3 = new Additions();
		System.out.println(t3.addDouble(39.5, 34.5));


	}

}
