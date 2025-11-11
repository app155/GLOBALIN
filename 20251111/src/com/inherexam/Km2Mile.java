package com.inherexam;

public class Km2Mile extends Converter {
	
	public Km2Mile(double ratio) {
		this.ratio = ratio;
	}

	public static void main(String[] args) {
		Km2Mile ktm = new Km2Mile(1.6);
		ktm.run();

	}

	@Override
	protected double convert(double src) {
		return src / ratio;
	}

	@Override
	protected String getSrcString() {
		// TODO Auto-generated method stub
		return "km";
	}

	@Override
	protected String getDestString() {
		// TODO Auto-generated method stub
		return "mile";
	}

}
