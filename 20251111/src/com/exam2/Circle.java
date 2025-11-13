package com.exam2;

public class Circle implements Shape {
	
	private int radius;
	
	public Circle(int radius) {
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("반지름이 %d인 원입니다.\n", radius);
	}
	
	@Override
	public double getArea() {
		return radius * radius * PI;
	}

	public static void main(String[] args) {
		Shape donut = new Circle(10);
		donut.redraw();
		System.out.println(donut.getArea());

	}

}
