package com.exam;

public abstract class PairMap {
	
	protected String keyArray[];
	protected String valueArray[];
	abstract String get(String key); // key로 value 검색
	abstract void put(String key, String value); // keyvaluePair......
	abstract String delete(String key);
	// key값을 가진 아이템(value와 함께)을 삭제하고 값 반환.
	abstract int length(); // 저장 개수 반환

}
