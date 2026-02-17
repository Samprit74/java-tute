package com.samprit.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectJDBC {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root123");
		PreparedStatement ps =connection.prepareStatement("Select * from student");
	    ResultSet rs=ps.executeQuery();   
	    
	    while(rs.next()) {
	    	String name=rs.getString("name");
	    	String mail=rs.getString("email");
	    	String gender=rs.getString("gender");
	    	String city=rs.getString("city");
	    	
	    	System.out.println("| "+name+" | "+mail+" | "+gender+" | "+city+" |");
	    	
	    }
	}

}
