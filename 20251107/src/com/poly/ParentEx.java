package com.poly;

/*
 *			다형성
 *				- 한 타입(객체)의 참조변수로 여러 타입의 객체를 참조할 수 있도록 하는 것을 의미.
 *				- 부모 클래스 타입의 참조변수로 자식 클래스의 인스턴스를 참조할 수 있도록 함.
 *				- 부모 클래스 = 자식 
 */

public class ParentEx {

	int foo = 5;
	
	public int getNumber(int a) {
		return a + 1;
	}
	
}
