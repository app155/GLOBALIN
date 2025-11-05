package com.exam;
import java.util.*;

public class DicApp {

	private Dictionary dic;
	private Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		DicApp app = new DicApp();
		
		app.run();
		
		while (true) {
			app.search();
		}
	}
	
	void run() {
		System.out.println("프로그램 실행");
		dic = new Dictionary();
	}
	
	void search() {
		System.out.println("한글단어 입력: ");
		
		String word = sc.next();
		
		if (word.equals("그만")) {
			System.exit(0);
		}
		
		String s = dic.korToEng(word);
		
		if (s == null) {
			System.out.printf("%s는 사전에 없습니다.\n", word);
		}
		else {
			System.out.printf("%s => %s\n", word, s);
		}
	}

}
