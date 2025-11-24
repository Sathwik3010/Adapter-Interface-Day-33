package com.codegnan.interfaces;

public class AudioPlayer implements MediaPlayer{

	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 file: "+fileName);
		} else {
			if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
				mediaAdapter = new MediaAdapter(audioType);
				mediaAdapter.play(audioType, fileName);
			} else {
				System.out.println("Invalid Media "+ audioType + " Format Not supported");
			}
		}
	}

}
