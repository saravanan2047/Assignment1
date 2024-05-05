package ZohoQuestions;
import java.util.*;
/* 1) Write a program to print a letters from the user input character to 'Z' without using
strings.
Example 1:  input : X
Output : XYZ
Example 2:  Input : M
Output : MNOPQRSTUWXYZ*/
//A-Z:65-90     a-z=:97-122
public class PrintingUptoZ 
{
	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the character: ");
		int x=scan.next().charAt(0);
		if(x>=65 && x<=90)
		{
			for(int i=x;i<=90;i++)
			{
				char s=(char)i;
				System.out.println(s);
			}
		}
		else {
		for(int i=x;i<=122;i++)
		{
			char s=(char)i;
			System.out.println(s);
		}
		}
		
		

	}

}
