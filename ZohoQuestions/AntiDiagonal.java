package ZohoQuestions;

import java.util.Scanner;

/*Q30) Given a N*N square matrix, return an array of its anti-diagonals. Look at the example for more
details.
Example
Input:
1 2 3
4 5 6
7 8 9
Output : [
[1],
[2, 4],
[3, 5, 7],
[6, 8],
[9]
]*/
public class AntiDiagonal 
{
	public static void main(String args[])
	{
		int A[][]= { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		AntiDiagonal m = new AntiDiagonal();
		m.diagonal(A);
	}
	
		// function to print the diagonals
		void diagonal(int A[][])
		{
			int N = 3;
			// For each column start row is 0
			for (int col = 0; col < N; col++) // it is upto diagonal
			{
				System.out.print("[");
				int startcol = col, startrow = 0;
				while (startcol >= 0 && startrow < N) 
				{
					System.out.print(A[startrow][startcol]+" ");
					startcol--;
					startrow++;
				}
				System.out.print("]");
				System.out.println();
			}
			// For each row start column is N-1
			for (int row = 1; row < N; row++) // for after the diagonal i.e lower triangel
			{
				int startrow = row, startcol = N - 1;
				System.out.print("[");
				while (startrow < N && startcol >= 0) 
				{
					System.out.print(A[startrow][startcol]+ " ");
					startcol--;
					startrow++;
				}
				System.out.print("]");
				System.out.println();
			}
		}

	
		
	}


