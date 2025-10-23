package com.switchex;
import java.util.*;

public class SwitchEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민번호: ");
		char gender = sc.next().charAt(7);
		int x = gender - '0';
		int year = 0;
		
		switch (x) {
		case 0: case 9:
			year = 1800;
			break;
		case 1: case 2:
			year = 1900;
			break;
		case 3: case 4:
			year = 2000;
			break;
		default:
			break;
		}
		
	}

}
