package com.exam;
import java.util.*;

public class Ex01 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수: ");
			int input = sc.nextInt();
			
			if (input == -1) {
				break;
			}
			
			v.add(input);
		}
		
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < v.size(); i++) {
			int num = v.get(i);
			max = max < num ? num : max;
		}
		
		System.out.printf("최댓값: %d", max);
	}

}
