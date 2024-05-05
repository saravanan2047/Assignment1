package zohoTask2;

import java.util.Scanner;

public class AntiDiagonalElements 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array size :");
		int arr[][]= new int[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the elements in the array: ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		    diagonal(arr);
	}
	//method to print the anti diagonal method
		public static void diagonal(int num[][])
		{
			int N = num.length;
			// For each column start row is 0
			for (int col = 0; col < N; col++) // it is upto diagonal
			{
				System.out.print("[");
				int startcol = col, startrow = 0;
				while (startcol >= 0 && startrow < N) 
				{
					System.out.print(num[startrow][startcol]+" ");
					startcol--;
					startrow++;
				}
				System.out.print("]");
				System.out.println();
			}
			// For each row start column is N-1
			for (int row = 1; row < N; row++) // for after the diagonal i.e lower triangle
			{
				int startrow = row, startcol = N - 1;
				System.out.print("[");
				while (startrow < N && startcol >= 0) 
				{
					System.out.print(num[startrow][startcol]+ " ");
					startcol--;
					startrow++;
				}
				System.out.print("]");
				System.out.println();
			}
		}

	

}
