package com.inherexam;
import java.util.*;

public abstract class Converter {
	abstract protected double convert(double src);
	abstract protected String getSrcString();
	abstract protected String getDestString();
	
	protected double ratio;
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.printf("%s을 %s로 바꿉니다.\n", getSrcString(), getDestString());
		
		System.out.printf("%s을 입력: ", getSrcString());
		double val = sc.nextDouble();
		double res = convert(val);
		
		System.out.printf("반환 결과: %.3f%s입니다.", res, getDestString());
	}

}
