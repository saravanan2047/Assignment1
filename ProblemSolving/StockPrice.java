package ProblemSolving;

import java.util.Scanner;

public class StockPrice {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Number Of Stocks:" );//7,1,5,3,6,4
		int [] arr= new int[scan.nextInt()];
		System.out.println("Enter the Stock Prices : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();			
		}
		if(arr.length!=0) {
		int minPrice=arr[0];
		int maxPrice=0;
		int index=0;
		for(int i=1;i<arr.length;i++)
		{
			if(minPrice>arr[i]) 
				{
					minPrice=arr[i];
					index=i;
				}	
		}
		if(index==arr.length) System.out.println("Profit :"+0);
		else
		{
			maxPrice=arr[index];
			for(int j=index;j<arr.length;j++)
			{
				if(maxPrice<arr[j])
				{
					maxPrice=arr[j];
				}
			}
			System.out.println("Profit "+(maxPrice-minPrice));
		}
		
		}
		else
		{
			System.out.println("First enter stock prices");
		}
	}

}
