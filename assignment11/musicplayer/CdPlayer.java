package assignment11.musicplayer;

public class CdPlayer implements Playable
{
	public void play() 
	{
		System.out.println("Playing CD player...💿");
	}
	public void pause() 
	{
		System.out.println("CD player is paused");
	}
	public void stop()
	{
		System.out.println("CD player Stopped...");
	}
	
}
