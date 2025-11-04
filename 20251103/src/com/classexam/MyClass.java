package com.classexam;

/*
 * 		생성자
 * 			- 메모리 내에 객체가 생성될 때 호출되어 객체의 구조를 인식하게 하고,
 * 			  생성되는 멤버 변수를 초기화 하는 목적.
 * 			- 생성자명은 클래스명과 동일하며 반환타입을 정의하지 않는다.
 * 			- 생성자 정의가 되어있지 않은 경우, 컴파일러가 기본 생성자를 자동으로 정의함.
 * 
 * 
 * 		접근제한자
 * 			- public	: 모든 접근 허용
 * 			- protected : 같은 패키지 내의 객체와 상속관계인 객체들만 접근 허용
 * 			- default	: 같은 패키지 내의 객체들만 접근 허용
 * 			- private 	: 현재 객체 내에서만 접근 허용
 */


public class MyClass {
	
	private String name;
	private int age;
	
	public MyClass() {
		
		name = "sdf";
	}
	
	public MyClass(String name) {
		this.name = name;
	}
	
	public MyClass(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
