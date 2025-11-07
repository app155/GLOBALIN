package com.inher;

public class CaptionTvMain {

	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
		
		ctv.displayCaption("asdf");
		ctv.caption = true;
		ctv.displayCaption("asdf");

	}

}
