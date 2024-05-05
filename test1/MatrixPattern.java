package test1;

import java.util.Scanner;

public class MatrixPattern {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the dimension : ");
		int n=scan.nextInt();
		int m=n;
		int [][] arr= new int[100][100];
 
		int startRow=0,endRow=n*2-1;
		int startCol=0,endCol=n-1;
	    int spiral=1;
//	    int startRow=0,endRow=n-1;
//		int startCol=0,endCol=n-1;
//	    int spiral=1;
//	    while(startRow<=endRow)
//	    {
//	       for(int i=startRow;i<=endRow;i++) 
//	       {
//	    	   arr[startRow][i]=spiral;
//	       }
//	       startRow++;
//	       for(int i=startRow;i<=endCol;i++) 
//	       {
//	          arr[i][endCol]=spiral;
//	       }
//	       endCol--;
//	       for(int i=endRow;i>=startRow;i--) 
//	       {
//	          arr[i][startCol]=spiral;
//	       }
//	       startCol++;
//	       for(int i=endCol;i>=startCol;i--) 
//	       {
//	          arr[endRow][i]=spiral;
//	       }
//	       endRow--;
//	       
//	       if(spiral==1)
//	            spiral=0;
//	       else
//	            spiral=1;
//	    }
	    
	    while(n!=0)
	    {
	    	for(int i=startRow;i<endRow;i++)
	    	{
	    		for(int j=startRow;j<endRow;j++)
	    		{
	    			if(i==startRow || i== endRow-1 || j==startRow || j==endRow-1)
	    			{
	    				arr[i][j]=spiral;
	    				
	    			}
	    		}
	    	}
	    	n--;
	    	startRow++;
	    	endRow--;
	    	
		       if(spiral==1)
		            spiral=0;
		       else
		            spiral=1;
	    }
   
	    // printing
		for(int i=0;i<m*2-1;i++)
		{
			for(int j=0;j<m*2-1;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
