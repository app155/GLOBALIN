package com.exam;

public abstract class Calc {
	
	protected int a, b;
	
	protected abstract int calculate();
	
	protected void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

}
