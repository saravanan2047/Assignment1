package zohoTask2;

import java.util.Scanner;

public class AdjacentStar {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the word : ");
		String str= scan.next();
		System.out.println("The modified word is : "+modifyString(str));
	}
	public static String modifyString(String s)
	{
		if(s.length()<=1 ) return s;
		else
		{
			return s.substring(0,1).equals(s.substring(1,2))?s.substring(0,1)+"*"+modifyString(s.substring(1)):s.substring(0,1)+modifyString(s.substring(1));
		  
		}
}
}


