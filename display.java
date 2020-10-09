package com.abc.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class display {
	public static void main(String[] args) throws SQLException {
		PreparedStatement pstmt = null;
		
		String username="root";
		String pwd="shanu0404";
		String url="jdbc:mysql://localhost:3306/student";
		
		Connection con = DriverManager.getConnection(url, username, pwd);
		System.out.println("Connected to database");
		String sql="select * from marks";
		pstmt=con.prepareStatement(sql);
		ResultSet res = pstmt.executeQuery();
		System.out.println("ID"+"  "+"Name");
		while(res.next())
		{
			System.out.println(res.getInt(1)+" "+res.getString(2));
		}
		
		
		
		
	}
}
