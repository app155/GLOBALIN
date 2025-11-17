package com.exam;
import java.util.*;

public class Ex04 {

	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<>();
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		while (true) {
			System.out.print("강수량 입력(0 종료): ");
			int value = sc.nextInt();
			
			if (value == 0) {
				break;
			}
			
			v.add(value);
			sum += value;
			
			for (int i = 0; i < v.size(); i++) {
				System.out.printf("%d ", v.get(i));
			}
			
			System.out.println();
			
			System.out.printf("현재 평균: %d\n", sum / v.size());
		}

	}

}
