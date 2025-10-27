package com.whileex;
import java.util.*;

public class WhileEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("승수 입력: ");
		int num = sc.nextInt();
		
		int i = 1, multi = 1;
		while (i <= num) {
			multi *= 2;
			i++;
		}
		
		System.out.printf("2의 %d승 => %d\n", num, multi);

	}

}
