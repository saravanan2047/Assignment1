package Assignment6;

import java.util.Scanner;

public class VowelsCount {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String :");
		
		String str= scan.next();
		int c=0;
		String vowels="AEIOUaeiou";
		for(int i=0;i<str.length();i++)
		{
			if(vowels.contains(str.substring(i,i+1))) c++;
		}
		System.out.println("Number of vowels is :"+c);
			

	}

}
