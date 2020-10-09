package com.abc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {
	public static void main(String[] args) throws SQLException {
	
		Connection con;
		PreparedStatement pstmt;
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pwd="shanu0404";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id : ");
		int id=sc.nextInt();
		System.out.println("Enter the name to be updated : ");
		String name=sc.next();
		con=DriverManager.getConnection(url, uname, pwd);
		String sql="update marks SET name = ? WHERE id=? ";
		pstmt=con.prepareStatement(sql);
		pstmt.setString(1,name);
		pstmt.setInt(2, id);
		int res=pstmt.executeUpdate();
		
		if(res==1)
			System.out.println("Updated record successfully");
		else
			System.out.println("Record not found");
	}
}
