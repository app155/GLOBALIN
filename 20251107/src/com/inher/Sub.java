package com.inher;

public class Sub extends Super {

	public Sub(int x) {
		super(x);
		System.out.println("하위 클래스 생성자: ");
	}

	int a = 10;
	
	public void test() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
	
}
