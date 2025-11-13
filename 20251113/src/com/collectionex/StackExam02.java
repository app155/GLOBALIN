package com.collectionex;
import java.util.*;

public class StackExam02 {
	
	private static final String[] Colors = {
			"검정", "노랑", "초록", "파랑", "빨강", "연두"
	};

	public static void main(String[] args) {
		Stack<String> st = new Stack<>();
		
		for (String color : Colors) {
			st.push(color);
		}
		
		popStack(st);

	}
	
	public static void popStack(Stack<String> st) {
		System.out.println("pop: ");
		while (!st.isEmpty()) {
			System.out.println(st.pop());
		}
		System.out.println();
	}

}
