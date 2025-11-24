package com.codegnan.interfaces;

// mediaAdapter acts as adapter between mediaplayer and advanced media player.
// it allows audioplayer(which supports only mp3) to play another
public class MediaAdapter implements MediaPlayer{

	private AdvancedMediaPlayers advancedPlayer;
	
	public MediaAdapter(String audioType) {
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer = new VlcPlayer();
		} else {
			if(audioType.equalsIgnoreCase("mp4")) {
				advancedPlayer = new Mp4Player();
			}
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if(audioType.equalsIgnoreCase("vlc")) {
			advancedPlayer.playVlc(fileName);
		} else {
			if(audioType.equalsIgnoreCase("mp4")) {
				advancedPlayer.playMp4(fileName);
			}
		}
	}
	
}
