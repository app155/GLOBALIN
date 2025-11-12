package com.exam;

public class Div extends Calc {

	public Div(int a, int b) {
		setValue(a, b);
	}

	@Override
	protected int calculate() {
		return a / b;
	}
	
}
