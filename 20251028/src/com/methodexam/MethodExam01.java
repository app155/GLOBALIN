package com.methodexam;

public class MethodExam01 {

	public void show() {
		System.out.println("sdffffffffff");
	}
	
	public int show(int i) {
		i = 1123123;
		System.out.println("sdffffffffff" + i);
		return i;
	}
	
	public static void main(String[] args) {
		MethodExam01 me = new MethodExam01();
		me.show();
		me.show(23);

	}

}
