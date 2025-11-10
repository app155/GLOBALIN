package com.interex;

/*
 * 		추상클래스와 인터페이스의 차이점
 * 
 * 			추상클래스									인터페이스
 * 			모든 멤버 변수 가능							public static final만
 * 			모든 멤버 메소드 가능							public abstract만
 * 			단일 상속만									다중 상속 가능
 * 			
 * 		추상클래스와 인터페이스의 공통점
 * 			- 객체 생성 불가능
 * 			- 상속받은 하위 클래스를 통해서 객체 생성
 * 			
 */

public class InterEx2 implements Inter3 {
	
	int a = 100;
	
	@Override
	public int getA() {
		return a;
	}

	@Override
	public int getData() {
		return a + 10;
	}

	public static void main(String[] args) {
		InterEx2 ie2 = new InterEx2();
		
		Inter1 it1 = ie2;
		Inter2 it2 = ie2;
		Inter3 it3 = ie2;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getA());
		System.out.println(it3.getData());

	}

}
