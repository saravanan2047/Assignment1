package assignment16.musicplayer;

import java.util.Scanner;

public class OptionSongs {

		private Scanner scan = new Scanner(System.in);
		private final byte SEE=1;
		private final byte ADD=2;
		private final byte DELETE=3;
		private final byte EXIT=0;
		private MusicPlayList songList = new MusicPlayList();
		private Songs head = null;
		private int count = 0;

		public void init() {

			System.out.println();
			System.out.println(SEE+" -> See All Songs");
			System.out.println(ADD+" -> Add song at a specific playlist");
			System.out.println(DELETE+" -> Delete a song from playlist");
			System.out.println(EXIT+" -> Exit");
			System.out.print("\nSelect your choice: ");
			byte choice = scan.nextByte();
			System.out.println();
			
			if(choice==SEE) {
				songList.printList(head);
			}
			else if(choice==ADD) {
				head = add(count, head, songList);
				count++;
			}
			else if(choice==DELETE) {
				head = delete(count, head, songList);
				count--;
			}
			else if(choice==EXIT) {
				System.out.println("Thank You");
				scan.close();
				System.exit(0);
			}
			else {
				System.out.println("Invalid choice. Try again.");
			}
			init();
		}

		public String getMusicName() {
			System.out.print("Enter the name of the music file you want to add: ");
			scan.nextLine();
			return scan.nextLine();
		}

		public Songs add(int count, Songs head, MusicPlayList songList) {
			System.out.print("Enter the index where you want to ADD :  ");
			int index =scan.nextInt();
			if (index < 0 || index > count) {
				System.out.println("Index is out of bounds. Can not add.");
				return head;
			} else {
				head = songList.insertAtIndex(head, index, getMusicName());
				System.out.println("\nSong added successfully.");
				System.out.println("There are now " + (++count) + " songs in the playlist.\n");
				return head;
			}
		}

		public Songs delete(int count, Songs head, MusicPlayList songList) {
			System.out.print("Enter the index where you want to DELETE :  ");
			int index =scan.nextInt();
			if (index < 0 || index > count) {
				System.out.println("Index is out of bounds. Can not delete.");
				return head;
			} else {
				head = songList.deleteAtIndex(head, index);
				System.out.println("\nSong deleted successfully.");
				System.out.println("There are now " + (--count) + " songs in the playlist\n");
				return head;
			}
		}
	

}
