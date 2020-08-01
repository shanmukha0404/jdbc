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
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter the html marks : ");
		int html=sc.nextInt();
		System.out.println("Enter the css marks : ");
		int css=sc.nextInt();
		System.out.println("Enter the js marks : ");
		int js=sc.nextInt();
		

		Date date = new Date();
		String date1 = date.toString();
		
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="shanu0404";
		
		con = DriverManager.getConnection(url, username, password);		
		String sql="insert into marks values(?,?,?,?,?,?)";
		pstmt=con.prepareStatement(sql);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, html);
		pstmt.setInt(4,css);
		pstmt.setInt(5, js);
		pstmt.setString(6, date1);
		
		
		boolean i = pstmt.execute();	
		
		if(i==false)
			System.out.println("Data entered into database successfully");
		else
			System.out.println("Something as went wrong");
		
		
		
	}

}
