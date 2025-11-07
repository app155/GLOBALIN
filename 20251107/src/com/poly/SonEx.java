package com.poly;

public class SonEx extends ParentEx {

	int foo = 7;
	
	@Override
	public int getNumber(int a) {
		return a + 2;
	}
	
	public static void main(String[] args) {
		ParentEx p = new SonEx();
		
		System.out.println(p.foo);
		System.out.println(p.getNumber(0));
		
		// 멤버변수는 부모, 멤버메소드는 자식의 것 사용.

	}

}
