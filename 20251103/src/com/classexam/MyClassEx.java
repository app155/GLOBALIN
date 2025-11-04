package com.classexam;

public class MyClassEx {

	public static void main(String[] args) {
		
		MyClass mc1 = new MyClass();
		MyClass mc2 = new MyClass("AAa");
		MyClass mc3 = new MyClass("bBb", 443);
		System.out.println(mc1.getName() + " " + mc1.getAge());
		System.out.println(mc2.getName() + " " + mc2.getAge());

	}

}
