package assignment11.musicplayer;

public class StreamingPlayer implements Playable
{
	public void play() 
	{
		System.out.println("Playing Stream player...🪕");
	}
	public void pause() 
	{
		System.out.println("Stream player is paused");
	}
	public void stop()
	{
		System.out.println("Stream player Stopped...");
	}
}
