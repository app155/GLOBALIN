package com.methodexam;

/*
 *			Varargs => 가변 매개변수 (Variable Arguments)
 *				- 메소드 정의시 통일된 인자의 자료형에 '...' 라고 명시.
 *				- 이를 통해 메소드를 수행하는데 필요한 인자의 수를 유연하게 구현할 수 있다.
 */


public class MethodExam05 {
	
	public void argExam(String ... n) {
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		System.out.println("---------------------------");
		
	}

	public static void main(String[] args) {
		MethodExam05 me = new MethodExam05();
		me.argExam("asdf");
		me.argExam("asdf", "asdfsdf");
		me.argExam("asdf", "asdfsdf", "jdnf");

	}

}
