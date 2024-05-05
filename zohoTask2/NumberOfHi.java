package zohoTask2;

import java.util.Scanner;

public class NumberOfHi 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the word : ");
		String str= scan.next();
		System.out.println("The number of Hi is  : "+countHi(str));
	}
	public static int countHi(String s)
	{
		int count=0;
		if(s.length()<=1 ) return 0;
		else
		{
			return s.substring(0,2).equals("hi")?+countHi(s.substring(1))+ 1:countHi(s.substring(1));
			  
		}
	}
	

}
