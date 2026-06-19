package com.javapractice;

public class GarColl {
	@Override
	protected void finalize() throws Throwable {
		super.finalize();
		System.out.println(" Finalized");
	}
	public static void m1() {
		GarColl g4 = new GarColl();
		System.out.println(g4);
	}

	public static void main(String[] args) {
		System.out.println("Main method started ");
		GarColl g1 = new GarColl();
		GarColl g2 = new GarColl();
		GarColl g3 = new GarColl();
		m1();
		g1 = null;
		g2 = g3;
		new GarColl();
		System.gc();
		System.out.println(g1);
		System.out.println(g2);
		System.out.println(g3);
	}

}
