package com.interex;

/*
 * 		인터페이스 상속관계
 * 			- 인터페이스 내에는 상수 또는 추상메소드가 정의됨.
 * 			- 따라서 인터페이스를 구현하겠다고 명시한 일반클래스에서 원하는 형태로 실제 구현력을 가지게 됨.
 * 			- 실제 구현력이 없는 인터페이스간의 상속에서는 다중 상속이 허용됨.
 * 			- 인터페이스가 다른 인터페이스를 상속받더라도 오버라이딩 할 수는 없음.
 */

public interface Inter3 extends Inter1, Inter2 {
	public int getData();
}
