package com.exam;

public class ColorPointEx extends Point {
	
	private String color;
	
	public ColorPointEx() {
		super(0, 0);
		color = "BLACK";
	}

	void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.format("%s색의 (%d, %d)점", color, getX(), getY());
	}
	
	

	public static void main(String[] args) {
		ColorPointEx zeroPoint = new ColorPointEx();
		System.out.println(zeroPoint.toString() + "입니다.");
		
		ColorPointEx cp = new ColorPointEx();
		cp.move(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");

	}

}
