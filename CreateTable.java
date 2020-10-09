package com.abc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CreateTable {
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		PreparedStatement pstmt;
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pwd="shanu0404";
		
		con=DriverManager.getConnection(url, uname, pwd);
		String sql="create table sravani(id integer,name varchar(20))";
		
		pstmt=con.prepareStatement(sql);
boolean i = pstmt.execute();	
		
		if(i==false)
			System.out.println("Table created successfully.");
		else
			System.out.println("Something as went wrong please try again later.");
	}
}
