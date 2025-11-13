package com.exam2;

public class Oval implements Shape {

	private int width;
	private int height;
	
	public Oval (int w, int h) {
		width = w;
		height = h;
	}
	
	
	@Override
	public void draw() {
		System.out.printf("가로: %d, 세로: %d인 타원입니다.\n", width, height);
		
	}

	@Override
	public double getArea() {
		return width * height * PI;
	}

}
