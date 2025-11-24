package com.codegnan.interfaces;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "beyond the origin.mp3");
		audioPlayer.play("mp4", "alone mp4");
	}

}
