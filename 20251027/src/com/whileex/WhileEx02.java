package com.whileex;
import java.util.*;

public class WhileEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int num = sc.nextInt();
		
		int i = 1;
		while (i <= num) {
			System.out.println(i * 3 + "\t");
			i++;
		}

	}

}
