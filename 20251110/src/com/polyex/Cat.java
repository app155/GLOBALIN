package com.polyex;

public class Cat extends Animal {
	
	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}
	
	@Override
	public String scream() {
		return "아옹";
	}

	@Override
	public String getName() {
		return name;
	}
}
