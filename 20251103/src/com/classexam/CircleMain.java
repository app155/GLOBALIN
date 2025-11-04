package com.classexam;

public class CircleMain {

	public static void main(String[] args) {
		
		Circle pizza = new Circle();
		
		pizza.radius = 10;
		pizza.name = "sdf";
		double area = pizza.getArea();
		
		System.out.println(pizza.name + "크기: " + area);
		
		Circle donut = new Circle();
		
		donut.radius = 2;
		donut.name = "ASDF";
		double donutArea = donut.getArea();
		
		System.out.println(donut.name + "크기: " + donutArea);

	}

}
