package com.abc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Scanner;

public class insertApp {
	
	public static void main(String[] args) throws SQLException {
		
		Connection con;
		PreparedStatement pstmt;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		System.out.println("Enter the name : ");
		String name=sc.next();
		
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="shanu0404";
		
		con = DriverManager.getConnection(url, username, password);		
		String sql="insert into sravani values(?,?)";
		pstmt=con.prepareStatement(sql);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		
		
		boolean i = pstmt.execute();	
		
		if(i==false)
			System.out.println("Data entered into database successfully");
		else
			System.out.println("Something as went wrong");
		
		
		
	}

}
