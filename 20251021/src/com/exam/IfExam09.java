package com.exam;
import java.util.*;

public class IfExam09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력: ");
		int money = sc.nextInt();
		
		if (money / 50000 > 0) {
			System.out.printf("오만원권 %d매\n", money / 50000);
			money %= 50000;
		}
		if (money / 10000 > 0) {
			System.out.printf("만원권 %d매\n", money / 10000);
			money %= 10000;
		}
		if (money / 5000 > 0) {
			System.out.printf("오천원권 %d매\n", money / 5000);
			money %= 5000;
		}
		if (money / 1000 > 0) {
			System.out.printf("천원권 %d매\n", money / 1000);
			money %= 1000;
		}
		if (money / 500 > 0) {
			System.out.printf("오백원권 %d매\n", money / 500);
			money %= 500;
		}
		if (money / 100 > 0) {
			System.out.printf("백원권 %d매\n", money / 100);
			money %= 100;
		}
		if (money / 50 > 0) {
			System.out.printf("오십원권 %d매\n", money / 50);
			money %= 50;
		}
		if (money / 10 > 0) {
			System.out.printf("십원권 %d매\n", money / 10);
			money %= 10;
		}
		System.out.printf("일원권 %d매\n", money);
	}

}
