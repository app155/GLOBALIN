package com.exam;

public class Tv {
	
	String company;
	int releaseYear;
	int size;
	
	public Tv(String company, int releaseYear, int size) {
		this.company = company;
		this.releaseYear = releaseYear;
		this.size = size;
	}
	
	void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV\n", company, releaseYear, size);
	}
	
	
	public static void main(String[] args) {
		
		Tv myTV = new Tv("LG", 2025, 32);
		myTV.show();
	}

}
