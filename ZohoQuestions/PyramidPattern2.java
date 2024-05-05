package ZohoQuestions;

import java.util.Scanner;

public class PyramidPattern2 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++)
			{
				System.out.print(n-i+k);
			}
			
			for(int l=0;l<i;l++ )
			{
				System.out.print(n-l-1);
			}
			System.out.println();
		}

	}

	

}
