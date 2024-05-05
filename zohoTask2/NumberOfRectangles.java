package zohoTask2;

import java.util.Scanner;

public class NumberOfRectangles 
{

	public static void main(String[] args) 
	{
		Scanner scan=  new Scanner(System.in);
		System.out.println("Enter the dimensions :");
		int arr[][]= new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the values in matrix :");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int count=0;
		System.out.print("Number of rectangles formed by 1s is : ");
		for(int i=1;i<arr.length;i++)
		{
			for(int j=1;j<arr[i].length;j++)
			{
				if(arr[i-1][j]==1 && arr[i][j-1]==1 && arr[i-1][j-1]==1)
				{
					count++;
				}
			}
		}
		System.out.println(count);
	}

}
