package com.exam;
/*

int a, b
void setValue(int a, int b) 피연산자 값 객체 내 저장
int calculator() 클래스 목적에 맡는 연산 후 결과반환

add sub mul div 클래스 공통된 필드 메소드 존재하니 추상클래서 calc에 작성


 */
public class Add extends Calc {
	
	public Add(int a, int b) {
		setValue(a, b);
	}

	@Override
	protected int calculate() {
		return a + b;
	}
}
