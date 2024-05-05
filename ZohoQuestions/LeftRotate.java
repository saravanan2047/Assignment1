package ZohoQuestions;

import java.util.Scanner;

/*19) Java Program to left rotate the elements of a multidimensional array*/
public class LeftRotate 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the dimnesion of array");
		int arr[][]= new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the elements in the array");
		// storing the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int [][] res=new int[arr.length][arr[0].length];
		// transpose of array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				res[i][j]=arr[j][i];
			}
		}
		
		// reversing the column elements
		int rows=0;
		int cols=0;
		while(cols<arr[0].length) // moving one column at a time
		{
			while(rows<arr.length/2) // moving down the row to half the distance else all it come back to its place again
			{
				int temp=res[rows][cols]; // here column is fixed
				res[rows][cols]=res[arr.length-1-rows][cols];
				res[arr.length-1-rows][cols]=temp;
				rows++; // to next row
			}
			rows=0; // making rows 0 again for next column
			cols++; // to next column
		}
		// printing the left rotated matrix
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
//		
//			
	}

}
