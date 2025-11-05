package com.exam;

public class Player {
	
	private int id;
	private String name;
	private String word;
	
	public Player(int id, String name) { 
		this.id = id;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public String getWord() {
		return word;
	}

}
