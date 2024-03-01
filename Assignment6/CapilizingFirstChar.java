package Assignment6;

import java.util.Scanner;

public class CapilizingFirstChar 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Sentence: ");
		String str=scan.nextLine();
		String arr[]= str.split(" ");
		String res="";
		
		for(int i=0;i<arr.length;i++)
		{
			res+=" "+arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
		}
		System.out.println("The reversed sentence is :"+res);

	}

}
