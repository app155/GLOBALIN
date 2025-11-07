package com.inher;

public class CalcMain {

	public static void main(String[] args) {
		BClass b = new BClass();
		
		if (!b.input()) {
			System.out.println("Error");
			return;
		}
		
		double result = b.calc();
		b.writer(result);

	}

}
