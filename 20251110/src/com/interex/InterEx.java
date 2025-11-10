package com.interex;

/*
 * 		인터페이스
 * 			- 일종의 추상 클래스 => 추상메소드를 갖지만 추상화 정도가 높아 멤버변수, 일반 메소드를 갖지 못함.
 * 			- 오직 추상메소드와 상수만을 멤버로 가짐.
 * 
 * 		인터페이스 작성
 * 			- 접근제한자 public 또는 default만 사용 가능.
 * 
 * 		인터페이스 제약사항
 * 			- 모든 변수는 public static final이어야 하며, 기본적으로 생략되어있다.
 * 			- 모든 메소드는 public abstract이어야 하며, 기본적으로 생략되어있다. (단, static 메소드, default 메소드는 제외.)
 */

public interface InterEx {
	
	int a = 100;
	int getA();

}
