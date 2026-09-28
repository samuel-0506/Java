package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseInsert {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlprac","root","Root");
		Statement smt = con.createStatement();
		
		System.out.println("Enter Query : ");
		String s=sc.nextLine();
		
		int rows=smt.executeUpdate(s);
		System.out.println(rows+" Rows affected");
		
		System.out.println("Enter select query : ");
		String q=sc.nextLine();
		ResultSet rs = smt.executeQuery(q);
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getInt(3)+" ");
			System.out.println();
		}
	}

}
