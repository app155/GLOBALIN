package com.exam;
import java.util.*;

public class Ex02 {

	public static void main(String[] args) {
		ArrayList<Character> grades = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력: ");
		
		while (grades.size() < 6) {
			char grade = sc.next().charAt(0); 
			
			grades.add(grade);
		}
		
		double sum = 0.0;
		for (int i = 0; i < grades.size(); i++) {
			switch (grades.get(i)) {
			case 'A':
				sum += 4.0;
				break;
			case 'B':
				sum += 3.0;
				break;
			case 'C':
				sum += 2.0;
				break;
			case 'D':
				sum += 1.0;
				break;
			case 'F':
				break;
			}
		}
		
		System.out.println(sum / 6);
	}

}
