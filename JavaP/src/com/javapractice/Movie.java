package com.javapractice;

public class Movie {
	static int movieId=101;
	static String movieName="puspha";
	static String industryName="Tollywood";
	int movieId2=12;
	String movieName2;
	String industryName2;
	
	
	public static void main(String[] args) {
		
		System.out.println("Movie ID : "+ movieId);
		System.out.println("movieName : "+ movieName);
		System.out.println("industryName : "+industryName);
		Movie m= new Movie();
		m.movieId2=102;
		m.industryName2="Tollywood";
		m.movieName2 = "RRR";
		System.out.println("Movie ID : "+m.movieId2);
		System.out.println("Movie Name : "+m.movieName2);
		System.out.println("Industry Name : "+m.industryName2);

					}

}
