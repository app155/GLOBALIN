package com.arrayex;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;
		arr[3] = 400;
		
		for (int i = 0; i < 10; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
		System.out.println();
		
		for (int i : arr) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
		
		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		for (int i = 0; i < 4; i++) {
			System.out.print(ch[i]);
		}
		
		System.out.println();
		
		for (char c : ch) {
			System.out.print(c);
		}

	}

}
