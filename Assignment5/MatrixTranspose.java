package Assignment5;

import java.util.Scanner;

public class MatrixTranspose 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimnesion of the matrix: ");
		int arr[][]= new int[scan.nextInt()][scan.nextInt()];
		// getting the data for the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				arr[i][j]= scan.nextInt();
		}
		int newArr[][]= new int[arr.length][arr[0].length];
		int temp=0;
		
		// transposing the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				temp=arr[i][j];
				arr[i][j]=newArr[j][i];
				newArr[j][i]=temp;
			}
		}
		
		// printing the Transposed array
		System.out.println("Transposed Array is : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
				System.out.print(newArr[i][j]+" ");
			System.out.println();
		}
		

	}

}
