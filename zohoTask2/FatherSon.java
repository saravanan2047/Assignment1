package zohoTask2;

import java.util.Scanner;

public class FatherSon {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the dimension of array :");
		String arr[][]= new String[scan.nextInt()][scan.nextInt()];
		System.out.println("Enter the names in the array :");
		// taking the user input
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=scan.next();
			}
		}
		int count=0;
		boolean stat=true;
		System.out.println("Enter the name of the father : ");
		String father =scan.next();
		String son= "";
		
		// finding the son for the grand father
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j][1].equals(father))
			{
				son=arr[j][0];
				break;
			}
			
		}
		// finding the grand children
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i][1].equals(son))	count++;
			}
		System.out.println("Number of Grand children for "+father+ " is  :"+(count));

	}

}
