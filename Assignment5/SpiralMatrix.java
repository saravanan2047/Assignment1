package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimnesion of the matrix: ");
		int n=scan.nextInt();
		int arr[][]= new int[n][n];
		int rows=0;  int rowe=n-1;
		int cols=0;  int cole=n-1;
		int num=1;
		while(num<=n*n)
		{
			for(int i=cols;i<=cole;i++)
			{
				arr[rows][i]=num;
				num++;
			}
			rows+=1;
			
			for(int j=rows;j<=rowe;j++)
			{
				arr[j][cole]=num;
				num++;
			}
			cole-=1;
			

			for(int i=cole;i>=cols;i--)
			{
				arr[rowe][i]=num;
				num++;
			}
			rowe-=1;

			for(int i=rowe;i>=rows;i--)
			{
				arr[i][cols]=num;
				num++;
			}
			cols+=1;

			
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			System.out.print(arr[i][j]+" ");
			System.out.println();
		}
		
	}
}
