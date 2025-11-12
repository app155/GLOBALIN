package com.exam;

public class Point3D extends Point {
	
	private int z;
	
	public Point3D (int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public void move(int x, int y, int z) {
		move(x, y);
		this.z = z;
	}
	
	public void moveUp() { z++; }
	public void moveDown() { z--; }
	
	@Override
	public String toString() {
		return String.format("(%d, %d, %d)의 점", getX(), getY(), z);
	}

	public static void main(String[] args) {
		Point3D p = new Point3D(1, 2, 3);
		System.out.println(p.toString() + "입니다.");
		
		p.moveUp();
		System.out.println(p.toString() + "입니다.");
		
		p.moveDown();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(100, 200, 300);
		System.out.println(p.toString() + "입니다.");
	}

}
