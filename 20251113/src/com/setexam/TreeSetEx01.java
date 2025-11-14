package com.setexam;
import java.util.*;

public class TreeSetEx01 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		
		String from = "b";
		String to = "d";
		
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		
		System.out.printf("range search from %s to %s\n", from, to);
		System.out.println("결과 1: " + set.subSet(from, to));
		System.out.println("결과 2: " + set.subSet(from, to + "zzz"));

	}

}
