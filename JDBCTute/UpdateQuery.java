package com.samprit.practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc_update {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String name="Soma";
		String mail="soma@gmail.com";
		String password="123abc";
		String gender="male";
		String city="kolkata";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","root123");
        
        PreparedStatement ps=connect.prepareStatement("update student set gender=? where gender=?");
        
        ps.setString(1,gender);
        ps.setString(2,"maie");
        
        int ans = ps.executeUpdate();
        
        System.out.println(ans>0?"Success":ans==0?"what the hell":"failed");
      
        
        
        

	}

}
