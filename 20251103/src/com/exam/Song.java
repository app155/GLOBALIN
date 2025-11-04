package com.exam;
import java.util.*;

public class Song {

	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		
	}
	
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	void show() {
		System.out.printf("%d년 %s 국적의 %s가 부른 %s\n", year, country, artist, title);
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("제목 가수 년도 국적 입력: ");
		
		String title = sc.next();
		String artist = sc.next();
		int year = sc.nextInt();
		String country = sc.next();
		
		Song song = new Song(title, artist, year, country);
		song.show();

	}

}
