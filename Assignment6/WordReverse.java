package Assignment6;

import java.util.Arrays;
import java.util.Scanner;

public class WordReverse 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the sentence: ");
		String str= scan.nextLine();
		
		String arr[]= str.split(" ");
		String res=arr[arr.length-1];
		
		for(int i=0;i<arr.length-1;i++)
		{
			res+=" "+arr[arr.length-2-i];
		}
		System.out.println("The reversed sentence is :"+res);
	}
}
