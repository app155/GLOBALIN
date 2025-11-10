package com.internalex;

/*
 * 		Local InnerClass
 * 			특정 메소드 안에서 정의되는 클래스.
 * 			특정 메소드 안에서 선언되는 지역변수와 같다.
 * 			메소드가 호출될 때 생성되며, 메소드가 종료될 때 자동으로 소멸됨. 근데 잘 안씀ㅎㅎㅋ.
 */

public class LocalInner {
	
	int a = 100;
	
	public void InnerExam(int k) {
		int b = 200;
		final int c = k;
		
		class Inner { // Local InnerClass는 외부 클래스의 멤버변수, 상수들만 접근 가능.
			public void getData() {
				System.out.println("int a: " + a);
				System.out.println("int b: " + b);
				System.out.println("final int c: " + c);
			}
		}
		Inner i = new Inner();
		i.getData();
	}

	public static void main(String[] args) {
		LocalInner li = new LocalInner();
		li.InnerExam(8900);

	}

}
