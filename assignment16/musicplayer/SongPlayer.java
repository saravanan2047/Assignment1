package assignment16.musicplayer;

public class SongPlayer {

		public void start() {
			System.out.println("<--------->Welcome to SS 🎵-Music Player-🎵 <--------->");
			new OptionSongs().init();
		}
		
		public static void main(String[] args) {
			SongPlayer musicPlayer=new SongPlayer();
			musicPlayer.start();
		}

	

}
