package com.exam;
import java.util.*;

public class CircleManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle[] circles = new Circle[3];
		
		float x, y;
		int radius;
		
		for (int i = 0; i < circles.length; i++) {
			System.out.print("x y radius 입력: ");
			
			x = sc.nextFloat();
			y = sc.nextFloat();
			radius = sc.nextInt();
			
			circles[i] = new Circle(x, y, radius);
		}
		
		for (int i = 0; i < circles.length; i++) {
			circles[i].show();
		}

	}

}
