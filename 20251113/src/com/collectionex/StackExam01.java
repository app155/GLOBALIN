package com.collectionex;

import java.util.*;

/*
 * 
 * 		컬렉션 프레임워크
 * 		1. 자료
 * 			- 현실세계로부터 단순한 관찰, 측정을 통해 수집된 사실이나 개념의 값들 또는 그 값들의 집합
 * 
 * 		2. 자료구조
 * 			- 자료 처리를 위한 자료의 표현, 저장, 관계, 관리 및 이용에 관한 방법 등의 개념을 이해하여 프로그램에 사용하고,
 * 			  컴퓨터에 의해 처리될 때 자료의 표현, 구성, 저장 및 처리를 위한 알고리즘의 작성 및 선택과 이용방법을 연구함
 * 
 * 		3. 컬렉션 프레임워크
 * 			- 인터페이스
 * 				컬렉션에 필요한 데이터 관리 기능 제공
 * 				각 컬렉션마다 고유한 인터페이스가 존재함
 * 			- 구현
 * 				인터페이스를 구현한 클래스이고 각 컬렉션을 실제 어떤 자료구조를 이용하여 표현하느냐에 따라 컬렉션의 종류가 달라짐
 * 			- 알고리즘
 * 				컬렉션마다 유용하게 사용할 수 있는 메소드
 */

/*
 * 		스택 (Stack)
 * 			객체의 후입선출 (LIFO)의 구조
 * 			5개의 메소드로 Vector클래스를 확장
 */

public class StackExam01 {
	
	public static void main(String[] args) {
		Stack<String> myStack = new Stack<>();
		
		myStack.add("AAA");
		myStack.add("BBB");
		myStack.add("CCC");
		myStack.add("DDD");
		
		String s1 = myStack.peek();
		System.out.println(s1);
		
		while (!myStack.isEmpty()) {
			String s = myStack.pop();
			System.out.println(s);
		}
	}

}
