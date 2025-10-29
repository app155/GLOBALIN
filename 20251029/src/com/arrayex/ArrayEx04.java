package com.arrayex;
import java.util.*;

public class ArrayEx04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 데이터 개수: ");
		int num = sc.nextInt();
		int[] arr = new int[num];
		int cnt = 0;
		int maxValue = Integer.MIN_VALUE;
		
		while (cnt < num) {
			System.out.print("데이터 입력: ");
			arr[cnt] = sc.nextInt();
			
			maxValue = arr[cnt] > maxValue ? arr[cnt] : maxValue; 
			cnt++;
		}
		
		System.out.println(maxValue);

	}

}
