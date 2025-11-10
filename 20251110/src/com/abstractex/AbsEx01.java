package com.abstractex;

/*
 * 		추상클래스의 상속관계
 * 			- 추상클래스들간에도 상속 가능.
 * 			- 일반클래스들간의 상속과 유사하나, 상속받은 추상메소드들을 반드시 재정의할 필요 없음.
 * 			- 추후 일반클래스와 상속관계가 이뤄졌을 때 재정의하면 됨.
 */

public abstract class AbsEx01 {
	
	int a = 100;
	final String str = "abs test";
	
	public String getStr() {
		return str;
	}
	
	public abstract int getA();

}
