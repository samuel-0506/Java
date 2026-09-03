package com.javaconstructors;

public class ParameterizedConstuctor {
	String movieName;
	String hero;
	String heroine;
	int budget;
	int collections;
	
	static void movie(String movieName,String hero,String heroine,int budget,int collections) {
		ParameterizedConstuctor c = new ParameterizedConstuctor();
		c.movieName = movieName;
		c.hero=hero;
		c.heroine=heroine;
		c.budget=budget;
		c.collections=collections;
		System.out.println("Movie name : " + c.movieName);
		System.out.println(c.hero);
		System.out.println(c.heroine);
		System.out.println(c.budget);
		System.out.println(c.collections);

	}

	public static void main(String[] args) {
		movie("Lenin","Akhil A","Bagya sri B",100,100000);

	}

}
