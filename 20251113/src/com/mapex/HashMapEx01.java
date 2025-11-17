package com.mapex;

import java.util.*;

/*
 * 		Map
 * 			- Key / Value 매핑 객체.
 * 			- Key는 각 1개의 Value를 매핑하며 중복이 허용되지 않음.
 * 			- 중복 Key 입력 시 기존 Value를 갱신.
 * 			- 정렬 기준이 없고 Key로 각 Value를 참조할 수 있음.
 * 
 * 		HashMap
 * 			- Key / Value를 하나의 쌍으로 저장하는 구조.
 * 			- null값 허용하지 않음.
 */

public class HashMapEx01 {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		map.put("만화", "키키");
		map.put("호러", "스크림");
		map.put("영화", "황혼");
		
		System.out.println(map);
		System.out.println();
		
		String key;
		
		Set<String> keys = map.keySet();
		
		Iterator<String> it = keys.iterator();
		
		while (it.hasNext()) {
			key = it.next();
			System.out.println(map.get(key));
		}
		
		map.put("영화", "달마");
		System.out.println(map);
		
	}

}
