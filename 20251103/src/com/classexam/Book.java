package com.classexam;

public class Book {
	
	String title;
	String author;
	
	public Book(String s) {
		title = s;
		author = "작자 미상";
	}
	
	public Book(String s, String a) {
		this(s);
		author = a;
	}

}
