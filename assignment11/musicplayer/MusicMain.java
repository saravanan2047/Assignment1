package assignment11.musicplayer;

public class MusicMain {

	public static void main(String[] args) 
	{
		CdPlayer cd = new CdPlayer();
		MP3Player mp= new MP3Player();
		StreamingPlayer sp=new StreamingPlayer();
		playMusic(cd);
		playMusic(mp);
		playMusic(sp);
	}
	static void playMusic(Playable p)
	{
		p.pause();
		p.play();
		p.stop();
		System.out.println();

	}

}
