package com.switchex;
import java.util.*;

public class SwitchEx06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호: ");
		char gender = sc.next().charAt(7);
		
		switch (gender) {
		case '1': case '3':
			break;
		case '2': case '4':
			break;
		default:
			break;
		}

	}

}
