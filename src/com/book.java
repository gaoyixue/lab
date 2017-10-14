package com;

import java.sql.Date;

public class book {
	private String ISBN;
    private String Title;
    private int AuthorID;
    private String Publisher;
    private String PublishDATE;
    private double Price;
   
    public String getISBN(){
    	return ISBN;
    }
    public void setISBN(String ISBN) {
    	this.ISBN=ISBN;
    }
    public String getTitle(){
    	return Title;
    }
    public void setTitle(String Title) {
    	this.Title=Title;
    }
    public int getAuthorID(){
    	return AuthorID;
    }
    public void setAuthorID(int AuthorID) {
    	this.AuthorID=AuthorID;
    }
    public String getPublisher(){
    	return Publisher;
    }
    public void setPublisher(String Publisher) {
    	this.Publisher=Publisher;
    }
    public String getPublishDATE(){
    	return PublishDATE;
    }
    public void setPublishDATE(String PublishDATE) {
    	this.PublishDATE=PublishDATE;
    }
    public double getPrice(){
    	return Price;
    }
    public void setPrice(double price) {
    	this.Price=price;
    }
}
