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
public class deletebookAction  extends ActionSupport{
     private String Title;
     private List<book> blist=new ArrayList<>();
	 private Connection conn=null;
	    private PreparedStatement pst = null;
	    private ResultSet rs=null;
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
						pst = conn.prepareStatement("delete from book where Title=?"); //创建Statement对象
						pst.setString(1, Title);
						pst.executeUpdate();
						pst = conn.prepareStatement("select * from book");
						rs=pst.executeQuery();
						while(rs.next()) {
							book book=new book();
					    	book.setISBN(rs.getString(1));
					    	book.setTitle(rs.getString(2));
					    	book.setAuthorID(rs.getInt(3));
					    	book.setPublisher(rs.getString(4));
					    	book.setPublishDATE(rs.getString(5));
					    	book.setPrice(rs.getDouble("Price"));
					    	System.out.println(rs.getDouble("Price"));
					    	blist.add(book);
						}
					}
					catch (Exception e) {
			        	  System.out.print("get data error!");
			        	  return "error";   
					}
			return SUCCESS;
		}
		public List<book> getBlist() {
			return blist;
		}
		public void setBlist(List<book> blist) {
			this.blist = blist;
		}
		public String getTitle() {
			return Title;
		}
		public void setTitle(String title) {
			Title = title;
		}
    
}
