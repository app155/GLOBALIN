package com.methodexam;
import java.util.*;

public class MethodExam06 {

	int input(String str) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print(str + ": ");
		int input = sc.nextInt();
		return input;
	}
	
	int getPerimeter(int width, int height) {
		return (width + height) * 2;
	}
	
	int getArea(int width, int height) {
		return width * height;
	}
	
	void printResult(int perimeter, int area) {
		System.out.printf("둘레: %d\n", perimeter);
		System.out.printf("넓이: %d\n", area);
	}
	
	public static void main(String[] args) {
		
		MethodExam06 me = new MethodExam06();
		
		int width = me.input("가로");
		int height = me.input("세로");
		
		int perimeter = me.getPerimeter(width, height);
		int area = me.getArea(width, height);
		
		me.printResult(perimeter, area);

	}

}
