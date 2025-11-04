package com.exam;

public class Circle {
	
	private float x, y;
	private int radius;
	
	public Circle(float x, float y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.printf("(%.1f, %.1f) %d\n", x, y, radius);
	}

}
