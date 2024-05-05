package ZohoQuestions;

import java.util.Scanner;

/*25) Write a program to print the following output for the given input. You can assume
the string is of odd length
Eg 1:  Input: 12345
        Output:
1       5
  2   4
    3
  2   4
1       5    */
public class Xpattern 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		String r=scan.next();
		if(r.length()%2==0)
		{
			System.out.println("Please consider string with odd length");
		}
		else {
		for(int i=0;i<r.length();i++)
		{
			for(int j=0;j<r.length();j++)
			{
				if(i==j || i+j==r.length()-1)
				{
					System.out.print(r.charAt(j));				
				}	
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}
	}

}
