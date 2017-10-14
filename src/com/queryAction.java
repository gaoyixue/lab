package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class queryAction extends ActionSupport {
    private String name;
    private List<book> list=new ArrayList<>();
    private Connection conn=null;
    private Statement stmt = null;
    private ResultSet rs = null;
	private int num;
	private static final long serialVersionUID = 1L;
	//ValueStack vs=ActionContext.getContext().getValueStack();
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
					String sql= "select * from author";
					rs = stmt.executeQuery(sql);
					
			    while(rs.next())
			    {
			    	if(name.equals(rs.getString("Name")))
			    		num=rs.getInt("AuthorID");
			    }
			    
			    sql= "select * from book";
				rs = stmt.executeQuery(sql);
			    while(rs.next()) {
			    	if(num==rs.getInt("AuthorID"))
			    	{
			    	book book=new book();
			    	book.setISBN(rs.getString(1));
			    	book.setTitle(rs.getString(2));
			    	book.setAuthorID(rs.getInt(3));
			    	book.setPublisher(rs.getString(4));
			    	book.setPublishDATE(rs.getString(5));
			    	book.setPrice(rs.getDouble(6));
			    
			    	list.add(book);
			    }}
			    }catch (Exception e) {
		        	  System.out.print("get data error!");
		        	  return "error";
			    }
			//vs.set("books", list);
		return SUCCESS;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<book> getList() {
		return list;
	}
	public void setList(List<book> list) {
		this.list = list;
	}
	
}
