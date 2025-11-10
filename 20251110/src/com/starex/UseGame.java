package com.starex;

public class UseGame {

	public static void main(String[] args) {
		Unit[] units = new Unit[3];
		
		units[0] = new Marine();
		units[1] = new SiegeTank();
		units[2] = new Dropship();
		
		for (int i = 0; i < units.length; i++) {
			System.out.println("---------------------------------------------------");
			units[i].move(200, 200);
			units[i].message();
			System.out.println("---------------------------------------------------");
		}

	}

}
