package com.abc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) throws SQLException {
		
		Connection con;
		PreparedStatement pstmt;
		
		String url="jdbc:mysql://localhost:3306/student";
		String uname="root";
		String pwd="shanu0404";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the ID to be deleted : ");
		int id=sc.nextInt();
		
		con=DriverManager.getConnection(url, uname, pwd);
		String sql="delete from marks where id=? ";
		pstmt=con.prepareStatement(sql);
		pstmt.setInt(1, id);
		int result = pstmt.executeUpdate();
		
		if (result == 1) 
			System.out.println("Record deleted successufully");
		else
			System.out.println("Error has been occured plz try again later");
			
	}
	
}
