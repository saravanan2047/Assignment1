package ZohoQuestions;

import java.util.Scanner;

/*29) Write a program to print the alphabet 'C' with the stars based on the given numbers
Eg 1:  Input: 4
        Output:
****
*
*
*****/
public class CStarPattern 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the rows :");
		int r=scan.nextInt();
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<r;j++)
			{
				if(i==0 || i==r-1 || j==0)
				{
					System.out.print("*");
				}
			
			}
			System.out.println();
		}

	}

}
