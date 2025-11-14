package com.vertorex;
import java.util.*;

class MyData {
	String name;
	int age;
	
	public MyData() {
		name = "";
		age = 0;
	}
	
	public MyData(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class VectorEx03 {

	public static void main(String[] args) {
		Vector<MyData> v = new Vector<>();
		
		v.add(new MyData("AAA", 10));
		v.add(new MyData("BBB", 20));
		v.add(new MyData("CCC", 30));
		
		for (MyData my : v) {
			System.out.printf("이름: %s, 나이: %d\n", my.name, my.age);
		}

	}

}
