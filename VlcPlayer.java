package com.codegnan.interfaces;

public class VlcPlayer implements AdvancedMediaPlayers{

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing VLC File: "+fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// do nothing - VLC player doesn't support mp4 format
	}

}
