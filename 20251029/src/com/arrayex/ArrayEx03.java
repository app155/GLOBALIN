package com.arrayex;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		char[] arr = new char[26];
		
		for (char c = 'A'; c <= 'Z'; c++) {
			arr[c - 'A'] = c;
		}
		
		for (char ch : arr) {
			System.out.printf("%c ", ch);
		}

	}

}
