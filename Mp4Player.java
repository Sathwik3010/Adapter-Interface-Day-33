package com.codegnan.interfaces;

public class Mp4Player implements AdvancedMediaPlayers{

	@Override
	public void playVlc(String fileName) {
		// do nothing - mp4 player doesn't support VLC format
		
	}

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing MP4 File: "+fileName);
	}


}
