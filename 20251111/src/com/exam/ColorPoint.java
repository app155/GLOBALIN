package com.exam;

public class ColorPoint extends Point {
	
	private String color;
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d)위치의 %s색 점", getX(), getY(), color);
	}

	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
		cp.move(10, 20);
		cp.setColor("RED");
		String str = cp.toString();
		System.out.println(str + "입니다.");
	}

}
