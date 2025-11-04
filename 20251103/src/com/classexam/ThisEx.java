package com.classexam;

/* 
 * 
 * 		this
 * 			- 특정 객체 내에서 자신이 생성되었을 때의 주소 값 변수.
 * 			- 객체의 주소는 객체가 생성되기 전 까지는 알 수 없기 때문에, 객체 생성 후 자신의 주소로 대치됨.
 * 
 * 		this()
 * 			- 현재 객체의 생성자를 의미함.
 * 			- 생성자 안에서 오버로딩 된 다른 생성자를 호출할 경우 this()라는 키워드로 호출.
 * 
 */

public class ThisEx {

	String name;
	String jumin;
	String tel;
	
	public ThisEx() {
		name = "Guest";
		jumin = "123456-7898765";
		tel = "123-234-3456";
	}
	
	public ThisEx(String name) {
		this();
		this.name = name;
	}
	
	public ThisEx(String name, String jumin) {
		this(name);
		this.jumin = jumin;
	}

	public ThisEx(String name, String jumin, String tel) {
		this(name, jumin);
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() {
		return tel;
	}
	
	
	
}
