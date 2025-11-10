package com.internalex;

class OuterEx {
	/*
	 * 		멤버 클래스
	 * 			외부 클래스의 멤버변수 위치에 선언, 외부 클래스의 인스턴스 멤버처럼 다루어짐.
	 * 			주로 클래스의 인스턴스 멤버들과 관련된 작업에 사용될 목적으로 선언됨.
	 */
	
	class InnerEx {
		int x = 5;
	}
}

public class InnerEx01 {

	public static void main(String[] args) {
		OuterEx outer = new OuterEx();
		OuterEx.InnerEx inner = outer.new InnerEx();

	}

}
