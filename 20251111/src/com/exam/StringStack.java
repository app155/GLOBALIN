package com.exam;
import java.util.*;

/*
 * 총 스택 저장공간 크기 입력: 3
 * 문자열 입력: hello
 * 문자열 입력: sunny
 * 문자열 입력: smile
 * 문자열 입력: happy
 * 꽉 차서 저장불가
 * 문자열 입력: 그만
 * 스택에 저장된 모든 문자열: smile sunny hello 
 */


public class StringStack implements Stack {
	private int length;
	private String[] arr;
	private int capacity;
	
	public StringStack () {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("총 스택 저장공간 크기 입력: ");
		int capacity = sc.nextInt();
		
		this.capacity = capacity;
		arr = new String[capacity];
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		String str = "";
		
		while (true) {
			System.out.print("문자열 입력: ");
			str = sc.next();
			
			if (str.equals("그만")) {
				break;
			}
			
			push(str);
		}
		
		System.out.print("스택에 저장된 모든 문자열 => ");
		
		for (int i = length - 1; i >= 0; i--) {
			System.out.printf("%s ", arr[i]);
		}
	}

	@Override
	public int length() {
		return length;
	}

	@Override
	public int capacity() {
		return capacity;
	}

	@Override
	public boolean push(String val) {		
		if (length() == capacity) {
			System.out.println("꽉 차서 저장불가");
			return false;
		}
		
		arr[length++] = val;
		return true;
	}

	@Override
	public String pop() {
		if (length == 0)
			return null;
		
		String str = arr[length - 1];
		arr[length--] = null;
		
		return str;
	}

}
