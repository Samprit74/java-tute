package com.samprit.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public final class JdbcTute {

	public static void main(String[] args) throws Exception {
		
		String name="xxxxx";
		String mail="xxxxx@gmail.com";
		String password="123abc";
		String gender="xxxxxx";
		String city="Tokyo";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Loaded");
		
        Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root123");
        System.out.println("connection succeeded");
        
        PreparedStatement ps=connect.prepareStatement("insert into student values(?,?,?,?,?)");
        
        ps.setString(1,name);
        ps.setString(2,mail);
        ps.setString(3,password);
        ps.setString(4,gender);
        ps.setString(5, city);
        int ans = ps.executeUpdate();
        
         System.out.println(ans>0?"Success":ans==0?"what the hell":"failed");
       
	}

}
