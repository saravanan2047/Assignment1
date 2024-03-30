package assignment11.musicplayer;

public class MP3Player implements Playable
{
	public void play() 
	{
		System.out.println("Playing MP3 songs.....🎶🎵");	
	}
	public void pause() 
	{
	System.out.println("Music Paused...");
	}
	public void stop() 
	{
		System.out.println("Music stopped...");	
	}
}
