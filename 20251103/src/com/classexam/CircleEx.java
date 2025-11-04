package com.classexam;

public class CircleEx {
	
	int radius;
	void set(int r) { radius = r; }
	double getArea() {
		return radius * radius * 3.14;
	}
	
	public CircleEx() {}
	
	public CircleEx(int r) {
		radius = r;
	}

	public static void main(String[] args) {
		
		CircleEx pizza = new CircleEx(10);
		System.out.println(pizza.getArea());
		
		CircleEx donut = new CircleEx();
		System.out.println(donut.getArea());
		
		System.out.println();
		
		CircleEx[] c = new CircleEx[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = new CircleEx(i);
			System.out.printf("c[%d] = %f ", i, c[i].getArea());
		}

	}

}
