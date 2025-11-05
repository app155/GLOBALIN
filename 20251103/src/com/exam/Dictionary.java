package com.exam;

public class Dictionary {
	
	private static String[] kor = { "ㅁㅁㅁ", "ㄴㄴㄴ", "ㅇㅇㅇ", "ㄹㄹㄹ", "ㅎㅎㅎ" };
	private static String[] eng = { "AAA", "SSS", "DDD", "FFF", "GGG" };
	
	public static String korToEng(String word) {
		
		for (int i = 0; i < kor.length; i++) {
			if (kor[i].equals(word)) {
				return eng[i];
			}
		}
		
		return null;
		
	}

}
