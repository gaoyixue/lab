package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class addbookAction extends ActionSupport{
	private String ISBN;
    private String Title;
    private int AuthorID;
    private String Publisher;
    private String PublishDATE;
    private double Price;
    private List<book> blist=new ArrayList<>();
	
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		AuthorID = authorID;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDATE() {
		return PublishDATE;
	}
	public void setPublishDATE(String publishDATE) {
		PublishDATE = publishDATE;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		this.Price = price;
	}
	 public List<book> getBlist() {
		return blist;
	}
	public void setBlist(List<book> blist) {
		this.blist = blist;
	}
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
						String URL="jdbc:mysql://w.rdc.sae.sina.com.cn:3306/app_gaoyixue";//�����ӵ��������ݿ�  
						String username="yk3y3zl0o1";  
						String password="2kyy0ly04izzh4ly10m10iykjwjx25kymzym0w1l"; 
						conn=DriverManager.getConnection(URL,username,password);
						pst = conn.prepareStatement("insert into book values(?,?,?,?,?,?)"); //����Statement����
						pst.setString(1, ISBN);
						pst.setString(2, Title);
						pst.setInt(3, AuthorID);
						pst.setString(4,Publisher);
						pst.setString(5,PublishDATE);
						pst.setDouble(6, Price);
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
					    	book.setPrice(rs.getDouble(6));
					    	blist.add(book);
						}
					}
					catch (Exception e) {
			        	  return "error";
					}
			return SUCCESS;
		}
}
