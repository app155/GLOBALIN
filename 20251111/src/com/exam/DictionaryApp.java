package com.exam;

public class DictionaryApp {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
		
		dic.put("홍길동", "자바");
		dic.put("이재문", "파이선");
		dic.put("이재문", "C++");
		System.out.println("이재문의 값: " + dic.get("이재문"));
		System.out.println("홍길동의 값: " + dic.get("홍길동"));
		dic.delete("홍길동");
		System.out.println("홍길동의 값: " + dic.get("홍길동"));
	}

}
