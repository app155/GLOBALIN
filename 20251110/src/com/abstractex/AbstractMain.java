package com.abstractex;

public class AbstractMain extends AbsEx02 {

	public static void main(String[] args) {
		AbstractMain am = new AbstractMain();
		System.out.println("am.getA(): " + am.getA());
		System.out.println("am.getStr(): " + am.getStr());

	}

	@Override
	public String getStr() { // AbsEx02의 추상메소드
		return str; // AbsEx01의 멤버필드
	}

}
