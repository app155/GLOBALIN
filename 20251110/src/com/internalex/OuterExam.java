package com.internalex;

public class OuterExam {
	
	public static class InnerEx {
		static int x = 10;
		public static void main(String[] args) {
			OuterExam.InnerEx ie = new OuterExam.InnerEx();
			System.out.println(ie.x);
			System.out.println(OuterExam.InnerEx.x);
			System.out.println(x);
		}
	}

}
