package com.exam;

public class PositivePoint extends Point {
	
	public PositivePoint() {
		this(0, 0);
	}
	
	public PositivePoint(int x, int y) {
		super(x, y);
		
		if (x < 0 || y < 0) {
			move(0, 0);
		}
	}
	
	@Override
	public void move(int x, int y) {
		if (x < 0 || y < 0) {
			return;
		}
		
		super.move(x, y);
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)의 점", getX(), getY());
	}
	

	public static void main(String[] args) {
		
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(10, -10);
		System.out.println(p2.toString() + "입니다.");
	}

}
