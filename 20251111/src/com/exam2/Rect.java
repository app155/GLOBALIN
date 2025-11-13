package com.exam2;

public class Rect implements Shape {
	
	private int width;
	private int height;
	
	public Rect (int w, int h) {
		width = w;
		height = h;
	}

	@Override
	public void draw() {
		System.out.printf("가로: %d, 세로: %d인 사각형입니다.\n", width, height);
		
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
