package com.javapractice;

public class MyTeam {
	String teamName;
	int trophies;
	String captain;
	String p;
	int jerNo;

	public static void main(String[] args) {

		MyTeam p = new MyTeam();
		p.teamName = "CSK";
		p.trophies = 7;
		p.captain = "MSD";
		MyTeam p1 = new MyTeam();
		p1.p = "MSD";
		p1.jerNo = 7;
		MyTeam p2 = new MyTeam();
		p2.p = "Giakwad";
		p2.jerNo = 31;
		MyTeam p3 = new MyTeam();
		p3.p = "Sanju";
		p3.jerNo = 11;
		MyTeam p4 = new MyTeam();
		p4.p = "Dube";
		p4.jerNo = 25;
		MyTeam p5 = new MyTeam();
		p5.p = "Brevis";
		p5.jerNo = 12;
		System.out.println("Team Name : " + p.teamName);
		System.out.println("Trophies Won : " + p.trophies);
		System.out.println("Captain : " + p.captain);
		System.out.println(" " + "\n" + "Players");
		System.out.println(p1.p + " - " + p1.jerNo + "\n" + p2.p + " - " + p2.jerNo + "\n" + p3.p + " - " + p3.jerNo
				+ "\n" + p4.p + " - " + p4.jerNo + "\n" + p5.p + " - " + p5.jerNo);

	}

	static {
		System.out.println("Welcome to the Campions Team");

	}
};
