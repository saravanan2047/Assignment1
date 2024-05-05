package ProblemSolving;

import java.util.Scanner;

public class ZeroToEnd {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array size:" );
		int [] arr= new int[scan.nextInt()];/*: {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0}-->{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}.
											 	{1, 0, 1, 0, 1, 0, 1, 0}--> {1, 1 , 1 , 1, 0, 0, 0, 0}*/
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();			
		}
		int res[]= new int[arr.length];
		int ref=0;
		for(int j=0;j<arr.length;j++)
		{
			if(j<arr.length && arr[j]!=0) 
			{
				res[ref]=arr[j];
				ref++;
			}
		}
		for(int x:res)
		{
			System.out.print(x+" ");
		}

	}

}
