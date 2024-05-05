package zohoTask2;

import java.util.Scanner;

public class AdjacentDuplicate 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Word : ");
		String str=scan.next();
		System.out.println(removeDuplicate(str));
	}
	public static String removeDuplicate(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				s=s.substring(0,i)+s.substring(i+2);
				return removeDuplicate(s);
			}
			
		}
			return s;
	}

}
