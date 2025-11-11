package com.inherexam;

// 32인치 1024컬러

public class ColorTv extends Tv {

	private int color;
	
	public ColorTv(int size, int color) {
		super(size);
		this.color = color;
	}
	
	void printProperty() {
		System.out.printf("%d인치 %d컬러\n", getSize(), color);
	}

	public int getColor() {
		return color;
	}

	public static void main(String[] args) {
		ColorTv myTv = new ColorTv(32, 1024);
		myTv.printProperty();
	}

}
