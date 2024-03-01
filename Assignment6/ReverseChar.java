package Assignment6;

import java.util.Scanner;

public class ReverseChar 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Word :");

		String str= scan.next();
		String newStr="";
		for(int i=0;i<str.length();i++)
		{
			newStr+=str.substring(str.length()-1-i,str.length()-i);
		}
		System.out.println("After the reverse :"+newStr);
		

	}

}
