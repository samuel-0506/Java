package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabasePrint {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sqlprac", "root", "Root");
		Statement smt = con.createStatement();
		
		System.out.println("Enter Query : ");
		String s = sc.nextLine();
		ResultSet rs = smt.executeQuery(s);

		while (rs.next()) {
			while (rs.next()) {
				System.out.print("ENo: " + rs.getInt("eNo")+" ");
				System.out.print("Name: " + rs.getString("ename")+" ");
				System.out.print("Salary: " + rs.getInt("sal")+" ");
				System.out.println();
			}
		}
	}

}
