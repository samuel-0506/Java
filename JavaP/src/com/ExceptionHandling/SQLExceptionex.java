package com.ExceptionHandling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SQLExceptionex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlprac","root","Root");
		
		Statement smt=con.createStatement();
		
		System.out.println("Enter Your query : ");
		String s = sc.nextLine();
		ResultSet rs =smt.executeQuery(s);
		
		while(rs.next()) {
			System.out.print(rs.getInt(1)+" ");
			System.out.print(rs.getString(2)+" ");
			System.out.print(rs.getInt(3)+" ");
			System.out.println();
		}
	}

}
