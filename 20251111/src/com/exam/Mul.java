package com.exam;

public class Mul extends Calc {

	public Mul(int a, int b) {
		setValue(a, b);
	}

	@Override
	protected int calculate() {
		return a * b;
	}
}
