package assignment16.musicplayer;

import java.util.Scanner;

public class MusicPlayList {

	public static Scanner sc = new Scanner(System.in);

	public Songs insertAtIndex(Songs head, int index, String musicFileName) {
		Songs newSong = new Songs(musicFileName);

		if (index == 0) {
			newSong.next = head;
			return newSong;
		}

		Songs prev = null;
		Songs current = head;
		int count = 0;
		while (current != null && count < index) {
			prev = current;
			current = current.next;
			count++;
		}

		if (count == index) {
			prev.next = newSong;
			newSong.next = current;
		}

		return head;
	}

	public Songs deleteAtIndex(Songs head, int index) {
		if (head == null || index < 0) {
			return head;
		}

		if (index == 0) {
			return head.next;
		}

		Songs prev = null;
		Songs current = head;
		int count = 0;

		while (current != null && count < index) {
			prev = current;
			current = current.next;
			count++;
		}

		if (count == index && current != null) {
			prev.next = current.next;
		}

		return head;
	}

	public void printList(Songs head) {
		Songs current = head;

		if (head == null) {
			System.out.println("No music found !!");
		}

		while (current != null) {
			System.out.println("--->"+current.musicFileName.toUpperCase());
			current = current.next;
		}
	}
}
