package assignment16.musicplayer;

public class Songs {
	String musicFileName;
	Songs next;

	public Songs(String musicFileName) {
		this.musicFileName = musicFileName;
		this.next = null;
	}
}
