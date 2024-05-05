package ZohoQuestions;
/*) Write a program to make such a pattern like a pyramid with numbers increased by 1.
Eg:  Input : 10
Output:
     1
    2 3
  4 5 6
7 8 9 10*/

import java.util.Scanner;

public class PyramidNumbers 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int c=1;
		System.out.println("Enter the number of rows :");
		int r=scan.nextInt();
		for(int i=0;i<=r;i++)
		{
			for(int j=0;j<=r-i;j++)
			{
				if(i==r)
				{
					continue;
				}
				else
				{
				System.out.print(" ");
				}
			}
			for(int k=0;k<i;k++)
			{
				System.out.print(c+" ");
				c++;
			}
			System.out.println();
		}

	}

}
