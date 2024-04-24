package test1;

import java.util.Scanner;

public class MatrixPattern {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the dimension : ");
		int n=scan.nextInt();
		int [][] arr= new int[n][n];
 
		int startRow=0,endRow=n-1;
		int startCol=0,endCol=n-1;
	    int spiral=1;
	    while(startRow<=endRow)
	    {
	       for(int i=startRow;i<=endRow;i++) {
	    	   arr[startRow][i]=spiral;
	            }
	       		startRow++;
	            for(int i=startRow;i<=endCol;i++) {
	            	arr[i][endCol]=spiral;
	            }
	            endCol--;
	            for(int i=endCol;i>=startCol;i--) {
	            	arr[endRow][i]=spiral;
	            }
	            endRow--;
	            for(int i=endRow;i>=startRow;i--) {
	            	arr[i][startCol]=spiral;
	            }
	            startCol++;
	            if(spiral==1)
	                spiral=0;
	            else
	                spiral=1;
	    }
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
