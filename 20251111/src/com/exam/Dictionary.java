package com.exam;

public class Dictionary extends PairMap {
	
	private int count;

	public Dictionary(int count) {
		keyArray = new String[count];
		valueArray = new String[count];
	}
	
	@Override
	String get(String key) {
		
		String value = "null";
		
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null && keyArray[i].equals(key)) {
				value = valueArray[i];
				break;
			}
		}
		
		return value;
	}

	@Override
	void put(String key, String value) {
		
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] != null && keyArray[i].equals(key)) {
				valueArray[i] = value;
				break;
			}
		}
		
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i] == null) {
				keyArray[i] = key;
				valueArray[i] = value;
				count++;
				break;
			}
		}
	}

	@Override
	String delete(String key) {
		
		String keyValuePair = null;
		
		for (int i = 0; i < keyArray.length; i++) {
			if (keyArray[i].equals(key)) {
				keyValuePair = String.format("key: %s, value: %s", keyArray[i], valueArray[i]);
				keyArray[i] = null;
				valueArray[i] = null;
				count--;
				break;
			}
		}
		
		return keyValuePair;
	}

	@Override
	int length() {
		
		return count;
	}

}
