package com.unitex;

public class SCV extends GroupUnit implements Repairable {

	public SCV() {
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if (r instanceof Unit) {
			Unit u = (Unit)r;
			
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			
			System.out.printf("%s 수리 끝\n", u.toString());
		}
	}
	
	@Override
	public String toString() {
		return "SCV";
	}

}
