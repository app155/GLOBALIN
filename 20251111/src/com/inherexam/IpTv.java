package com.inherexam;

// 나의 IPTV는 192.168.0.36 주소의 32인치 2048컬러

public class IpTv extends ColorTv {
	
	private String address;
	
	public IpTv(String address, int size, int color) {
		super(size, color);
		this.address = address;
	}
	
	@Override
	void printProperty() {
		System.out.printf("나의 IPTV는 %s 주소의 %d인치 %d컬러\n", address, getSize(), getColor());
	}

	public static void main(String[] args) {
		IpTv iptv = new IpTv("192.168.0.36", 32, 2048);
		iptv.printProperty();
	}

}
