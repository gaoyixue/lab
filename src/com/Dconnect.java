package com;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;

public class Dconnect {
	private Connection conn=null;
	private PreparedStatement pst;
	private ResultSet rs;
	private Statement st;
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bookdb?useSSL=false","root","19971003");
			}catch(Exception e) {
	    		e.printStackTrace();
			}
			return conn;
    }
}
