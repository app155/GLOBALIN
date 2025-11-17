package com.mapex;
import java.util.*;

public class HashMapEx03 {

	static HashMap phoneBook = new HashMap();
	
	static void addGroup(String groupName) {
		if (!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	static void addPhoneNo(String name, String tel) {
		addPhoneNo("기타", name, tel);
	}
	
	static void addPhoneNo(String groupName, String name, String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(tel, name);
	}
	
	static void printList() {
		Set set = phoneBook.entrySet();
		
		Iterator it = set.iterator();
		
		while (it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			
			Iterator subIt = subSet.iterator();
			
			System.out.printf("%s [%d]\n", e.getKey(), subSet.size());
			
			while (subIt.hasNext()) {
				Map.Entry e2 = (Map.Entry)subIt.next();
				
				String tel = (String)e2.getKey();
				String name = (String)e2.getValue();
				System.out.printf("%s %s\n", name, tel);
			}
		}
	}
	
	public static void main(String[] args) {
		addPhoneNo("친구", "AAA", "010-1234-5678");
		addPhoneNo("친구", "BBB", "010-1234-8765");
		addPhoneNo("친구", "BBB", "010-4321-5678");
		addPhoneNo("회사", "ZZZ", "010-1111-2222");
		addPhoneNo("회사", "YYY", "010-1111-3333");
		addPhoneNo("회사", "XXX", "010-1111-4444");
		addPhoneNo("회사", "WWW", "010-2222-2222");
		addPhoneNo("세탁소", "010-8888-8888");
		
		
		printList();

	}

}
