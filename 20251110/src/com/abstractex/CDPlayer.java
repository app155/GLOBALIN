package com.abstractex;

public class CDPlayer extends Player {

	int currentTrack;
	
	
	@Override
	void play(int pos) {
		// TODO Auto-generated method stub
		
	}

	@Override
	void stop() {
		// TODO Auto-generated method stub
		
	}
	
	void nextTrack() {
		currentTrack++;
	}
	
	void preTrack() {
		if (currentTrack > 1) {
			currentTrack--;
		}
	}

}
