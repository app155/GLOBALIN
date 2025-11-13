package com.exam2;

public class Fish extends GameObject {

	private final int MOVEPERCENTAGE = 60;
	
	public Fish(int startX, int startY, int distance) {
		super(startX, startY, distance);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void move() {
		int ranPer = (int)(Math.random() * 100);
		
		if (ranPer < MOVEPERCENTAGE)
			return;
		
		int ranDir = (int)(Math.random() * 4);
		
		switch (ranDir) {
		case 0:
			y = y < distance ? y : y - distance;
			break;
		case 1: 
			x = x < distance ? x : x - distance;
			break;
		case 2:
			y = y >= Game.FIELD_HEIGHT - distance ? y : y + distance;
			break;
		case 3: 
			x = x >= Game.FIELD_WIDTH - distance ? x : x + distance;
		}
		
		
		
	}

	@Override
	protected char getShape() {
		return '@';
	}

}
