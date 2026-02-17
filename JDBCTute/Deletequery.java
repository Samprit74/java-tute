package com.samprit.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteJdbc {

	public static void main(String[] args) throws Exception {
		
		String mail="soma@gmail.com";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root123");
        
		PreparedStatement ps = connection.prepareStatement("delete from student where email=?");
		
		ps.setString(1,mail );
		
		int ans=ps.executeUpdate();
		
		System.out.println(ans>0?"Success":ans==0?"what the hell":"failed");
	}

}
