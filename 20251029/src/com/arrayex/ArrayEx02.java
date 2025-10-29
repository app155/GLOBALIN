package com.arrayex;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		int[] arr = { 4, 7, 9, 1, 3, 2, 5, 6, 8 };
		
		System.out.println("전체 출력");
		
		for (int num : arr) {
			System.out.printf("%d ", num);
		}
		
		System.out.println();
		System.out.println("짝수 출력");		
		
		for (int num : arr) {
			if (num % 2 == 0)
				System.out.printf("%d ", num);
		}
		
		System.out.println();
		System.out.println("3의 배수 출력");
		
		for (int num : arr) {
			if (num % 3 == 0)
				System.out.printf("%d ", num);
		}

	}

}
