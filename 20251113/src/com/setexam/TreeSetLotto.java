package com.setexam;
import java.util.*;

public class TreeSetLotto {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<>();
		
		for (; set.size() < 6;) {
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);

	}

}
