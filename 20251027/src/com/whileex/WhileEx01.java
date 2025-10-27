package com.whileex;
import java.util.*;

public class WhileEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		/*
		for (int i = 0; i < num; i++) {
			System.out.println("asdf!1");
		}
		*/
		int i = 0;
		while (i < num) {
			System.out.println("asdf!1");
			i++;
		}
	}

}
