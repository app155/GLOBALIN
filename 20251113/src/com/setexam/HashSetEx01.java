package com.setexam;
import java.util.*;

public class HashSetEx01 {

	public static void main(String[] args) {
		
		Object[] objArr = { "1", 1, "2", "2", "3", "3", "4", "4", "4" };
		
		Set<Object> set = new HashSet<>();
		
		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}
		
		System.out.println(set);
		System.out.println();
		
		Iterator<Object> it = set.iterator();
		
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}

	}

}
