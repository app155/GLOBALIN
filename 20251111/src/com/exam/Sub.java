package com.exam;

public class Sub extends Calc {

	public Sub(int a, int b) {
		setValue(a, b);
	}

	@Override
	protected int calculate() {
		return a - b;
	}
	
}
