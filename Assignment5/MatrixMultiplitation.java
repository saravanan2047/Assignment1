package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplitation 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the dimension of the first matrix: "); // first array input
		int arr1[][]= new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the element in the first matrix:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr1[i][j]=scan.nextInt();
			}
		}
		System.out.println("Enter the dimension of the second matrix: "); // second array input
		int arr2[][]= new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the element in the Second matrix:");
		for(int l=0;l<arr2.length;l++)
		{
			for(int m=0;m<arr2[l].length;m++)
			{
				arr2[l][m]=scan.nextInt();
			}
		}
		
		if(arr1[0].length==arr2.length) 
		{
			int [][] res= new int[arr1.length][arr2[0].length];
			for(int i=0;i<arr1.length;i++)  // traversing through first array row
			{
				for(int j=0;j<arr2[0].length;j++) // traversing through second array column
				{
					int sum=0;
					for(int k=0;k<arr1[0].length;k++) // traversing through first array column or traversing through second array row
					{
						sum+=arr1[i][k]*arr2[k][j];
					}
					res[i][j]=sum;
				}
			}
			for(int i=0;i<res.length;i++)
			{
				for(int j=0;j<res[i].length;j++)
				{
					System.out.print(res[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else System.out.println("Multiplication not possible...!");
		
		

	}

}
