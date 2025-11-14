package com.vertorex;
import java.util.*;


public class VectorEx02 {

	private static final String[] Colors = { "검정", "노랑", "초록", "파랑", "빨강", "연두" };
	
	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		
		for (String s : Colors) {
			v.add(s);
		}
		
		System.out.println("첫 번째 요소: " + v.firstElement());
		System.out.println("두 번째 요소: " + v.get(1));
		System.out.println("마지막 요소: " + v.lastElement());
		System.out.println("요소의 개수: " + v.size());
		System.out.println("벡터의 용량: " + v.capacity());
		
		v.set(0, "하양");
		System.out.println("첫 번째 요소: " + v.firstElement());
		v.insertElementAt("하늘", 1);
		System.out.println("두 번째 요소: " + v.get(1));
		System.out.println("요소의 개수: " + v.size());
		System.out.println("벡터의 용량: " + v.capacity());
		
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		Collections.sort(v);
		System.out.println("오름차순 정렬 후");
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		int idx = Collections.binarySearch(v, "파랑");
		System.out.println("파랑 " + idx + "인덱스에 위치");
		
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("내림차순 정렬 후");
		for (String s : v) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		int idx2 = Collections.binarySearch(v, "파랑");
		System.out.println("파랑 " + idx2 + "인덱스에 위치");
		
		int idx3 = Collections.binarySearch(v, "파랑", Collections.reverseOrder());
		System.out.println("파랑 " + idx3 + "인덱스에 위치");
	}

}
