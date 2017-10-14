package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.opensymphony.xwork2.ActionSupport;

public class clicktitleAction extends ActionSupport {
    private String Title;
    public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public book getBook() {
		return book;
	}
	public void setBook(book book) {
		this.book = book;
	}
	public author getAuthor() {
		return author;
	}
	public void setAuthor(author author) {
		this.author = author;
	}
	private int num;
	private book book;
    private author author;
    private Connection conn=null;
    private Statement stmt = null;
    private ResultSet rs = null;
	private static final long serialVersionUID = 1L;
	public String execute() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			}catch(Exception e) {
	    		e.printStackTrace();
			}
		try {
			String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_gaoyixue";//我连接的是主数据库  
			String username="yk3y3zl0o1";  
			String password="2kyy0ly04izzh4ly10m10iykjwjx25kymzym0w1l"; 
			conn=DriverManager.getConnection(URL,username,password);
			stmt = conn.createStatement(); //创建Statement对象
			String sql= "select * from book";
			rs = stmt.executeQuery(sql);
			 //Title=new String(Title.getBytes("ISO-8859-1"),"utf-8");
	    while(rs.next())
	    {
	    	if(Title.equals(rs.getString("Title")))
	    	{
	    		book bk=new book();
	    		num=rs.getInt("AuthorID");
	    		bk.setISBN(rs.getString(1));
	    	bk.setTitle(rs.getString(2));
	    	bk.setAuthorID(rs.getInt(3));
	    	bk.setPublisher(rs.getString(4));
	    	bk.setPublishDATE(rs.getString(5));
	    	bk.setPrice(rs.getDouble(6));
	    	this.setBook(bk);
	    	}
	    }
	    
	    sql= "select * from author";
		rs = stmt.executeQuery(sql);
	    while(rs.next()) {
	    	if(num==rs.getInt("AuthorID"))
	    	{
	    	author ar=new author();
	    	ar.setAuthorID(rs.getInt("AuthorID"));
	    	ar.setName(rs.getString("Name"));
	    	ar.setCountry(rs.getString("Country"));
	    	ar.setAge(rs.getInt("Age"));
	    	this.setAuthor(ar);
	    }}
	    }catch (Exception e) {
        	  return "error";
          }
return SUCCESS;
}
}
