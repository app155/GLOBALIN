package com.exam2;

public interface Shape {
	final double PI = 3.14;
	void draw();
	double getArea();
	default void redraw() {
		System.out.println("다시그리기");
		draw();
	}
}
