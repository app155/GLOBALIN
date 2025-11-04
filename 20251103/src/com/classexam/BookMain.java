package com.classexam;

public class BookMain {

	public static void main(String[] args) {
		
		Book littlePrince = new Book("어린왕자", "생택쥐페리");
		System.out.println(littlePrince.title + " " + littlePrince.author);
		
		Book b = new Book("춘향전");
		System.out.println(b.title + " " + b.author);

	}

}
