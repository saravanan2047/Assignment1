package Assignment7;

import java.util.Scanner;

public class CharacterTrain {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=scan.next();
		if(str.length()%2!=0)
		{
			String s="";
			String d="";
			for(int i=0;i<str.length()/2;i++)
			{
	
				s+=str.substring(i,i+1).repeat(str.length()/2+1-i);
				
				d+=str.substring(str.length()/2+i,str.length()/2+i+1).repeat(str.length()/2+i-str.length()/2+1+i);
			}
//			for(int j=str.length()/2;j<str.length();j++)
//			{
//				s+=str.substring(j,j+1).repeat(j-str.length()/2+1);
//			}
			System.out.println(s+d);
		}
		else
		{
			System.out.println("Enter a valid string");
		}

	}

}
