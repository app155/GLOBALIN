package com.internalex;

/*
 * 			익명 이너클래스
 * 				정의된 이름이 없는 클래스.
 * 
 * 				- Event와 관련.
 * 				- interface 구현이 필요없음.
 * 				- 일반 메소드 내부에서 정의부를 가질 수 있음.
 * 				- 추상 클래스 상속 받을 수 있음.
 * 				- 반드시 final로 선언해야함.
 * 				- implements 할 때, 한 개만 implements 함.  
 */

public class AnonyInner {

	TestAbs inn = new TestAbs() {
		@Override
		public void printData() {
			System.out.println("data :" + data);
		}
	};
	
	public static void main(String[] args) {
		AnonyInner ai = new AnonyInner();
		ai.inn.printData();

	}

}
