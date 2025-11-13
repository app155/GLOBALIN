package com.exam2;

public class Bear extends GameObject {

	private int nextX, nextY;
	
	public Bear(int startX, int startY, int distance) {
		super(startX, startY, distance);
	}
	
	public void move(char c) {
		switch (c) {
		case 'w': case 'W':
			nextY = y < distance ? y : y - distance;
			break;
			
		case 'a': case 'A':
			nextX = x < distance ? x : x - distance;
			break;
			
		case 's': case 'S':
			nextY = y >= Game.FIELD_HEIGHT - distance ? y : y + distance;
			break;
			
		case 'd': case 'D':
			nextX = x >= Game.FIELD_WIDTH - distance ? x : x + distance;
			break;
		}
		
		move();
	}

	@Override
	protected void move() {
		x = nextX;
		y = nextY;
	}

	@Override
	protected char getShape() {
		return 'B';
	}

}
