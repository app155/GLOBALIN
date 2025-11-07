package com.inher;

public class Circle extends Shape {
	
	Point center;
	int r;
	
	public Circle() {
		this(new Point(), 100);
	}
	
	public Circle(Point center, int r) {
		this.center = center;
		this.r = r;
	}
	
	@Override
	void draw() {
		System.out.printf("[center =  (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, color);
	}

}
