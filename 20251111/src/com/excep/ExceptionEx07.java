package com.excep;

public class ExceptionEx07 {

	public static void main(String[] args) throws Exception {
		//method01();

	}
	
	static void method01() throws Exception {
		method02();
	}
	
	static void method02() throws Exception { 
		throw new Exception();
	}

}
