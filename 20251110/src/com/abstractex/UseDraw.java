package com.abstractex;

public class UseDraw {

	public static void main(String[] args) {
		Diagram[] dia = new Diagram[3];
		
		dia[0] = new Triangle();
		dia[1] = new Rectangle();
		dia[2] = new Circle();
		
		for (int i = 0; i < dia.length; i++) {
			dia[i].draw();
		}

	}

}
