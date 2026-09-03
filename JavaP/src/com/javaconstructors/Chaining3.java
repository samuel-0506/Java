package com.javaconstructors;

import java.util.Scanner;

public class Chaining3 {
	String iplTeam;
	String captain;
	int noOfPlayers;
	int trophiesWon;
	int cltsWon;

	Chaining3() {
		this("unknown");
	}

	Chaining3(String iplTeam) {
		this("unknown","unknown");
	}

	Chaining3(String iplTeam, String captain) {
		this("unknown","unknown",11);
	}

	Chaining3(String iplTeam, String captain, int noOfPlayers) {
		this("unknown","unknown",11,5,2);
	}

	Chaining3(String iplTeam, String captain, int noOfPlayers , int trophiesWon ,int cltsWon) {
		this.iplTeam=iplTeam;
		this.captain=captain;
		this.noOfPlayers=noOfPlayers;
		this.trophiesWon=trophiesWon;
		this.cltsWon=cltsWon;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Team Name : ");
		String iplTeam = sc.nextLine();
		System.out.println("Enter Team Captain : ");
		String captain = sc.nextLine();
		System.out.println("No of Players : ");
		int noOfPlayers = sc.nextInt();
		System.out.println("No of IPL Trophies : ");
		int trophiesWon = sc.nextInt();
		System.out.println("No of CLT Trophies : ");
		int cltsWon = sc.nextInt();
		Chaining3 c = new Chaining3(iplTeam,captain,noOfPlayers,trophiesWon,cltsWon);
		c.show();
		sc.close();
	}
	void show() {
		System.out.println("IPL Team : " +  iplTeam);
		System.out.println("Team captain : " +  captain);
		System.out.println("No of Team Players : " +  noOfPlayers);
		System.out.println("IPL Trophies Won : " +  trophiesWon);
		System.out.println("CLT trophies Won : " +  cltsWon);
	}

}
