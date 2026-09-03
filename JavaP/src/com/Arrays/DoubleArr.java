package com.Arrays;

public class DoubleArr {

	public static void main(String[] args) {
		double [] sal=new double[6];
		sal[0]= 50000;
		sal[1]= 40000;
		sal[2]= 70000;
		sal[3]= 90000;
		sal[4]= 10000;
		sal[5]= 90000;
		
		for(int i=0;i<sal.length;i++) {
			System.out.println(sal[i]);
		}System.out.println("___________________________");
		System.out.println(" ");
		for(double salary:sal) {
			System.out.println(salary);
		}
	}

}
