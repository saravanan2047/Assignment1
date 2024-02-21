package assignment2;

import java.util.Scanner;

public class TimeConversion 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the seconds : ");
		int sec=scan.nextInt();
		if(sec<=60)
		{
			System.out.println("OO:OO:"+sec);
		}
		else
		{
			int hour=sec/3600;
			int rem=sec%3600;
			int min=rem/60;
			int s=rem%60;
			System.out.print("HH:MM:SS---->  ");
			System.out.printf("%02d:%02d:%02d",hour,min,s);
		}
	}

}
