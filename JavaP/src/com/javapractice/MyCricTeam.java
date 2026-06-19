package com.javapractice;

public class MyCricTeam {
	String teamName;
	int total_players;
	int trophies;
    String captain;
    String p1="MS Dhoni";
    int jer=7;
    String p2="Gaikwad";
    int jer2=31;
    String p3="Sanju";
    int jer3=11;
    String p4="DB";
    int jer4=12;
    String p5="Short";
    int jer5=32;
    String p6="Hosein";
    int jer6=20;
    String p7="N Ahmad";
    int jer7=15;
    String p8="K Ahmad";
    int jer8=71;
    String p9="Dube";
    int jer9=25;
    String p10="A Kamboj";
    int jer10=47;
    String p11="M Henry";
    int jer11=21;
	public static void main(String[] args) {
		System.out.println("Welcome to CSK !!"); 
		MyCricTeam c = new MyCricTeam();
		c.captain="M S Dhoni";
		c.teamName="CSK";
		c.total_players=11;
		c.trophies=7;
		System.out.println("Team Name : "+c.teamName);
		System.out.println("Num of Players : "+c.total_players);
		System.out.println("Captain : "+c.captain);
		System.out.println("Trophies Won : "+c.trophies);
		System.out.println(" ");
		System.out.println("PLAYERS ");
		System.out.println(c.p1+" - "+ c.jer + "\n" +
				c.p2+ " - " + c.jer2 + "\n" +
				c.p3+ " - " + c.jer3 + "\n" +
				c.p4+ " - " + c.jer4 + "\n" +
				c.p5+ " - " + c.jer5 + "\n" +
				c.p6+ " - " + c.jer6 + "\n" +
				c.p7+ " - " + c.jer7 + "\n" +
				c.p8+ " - " + c.jer8 + "\n" +
				c.p9+ " - " + c.jer9 + "\n" +
				c.p10+" - " + c.jer10 + "\n" +
				c.p11+" - " + c.jer11);

	}

}
