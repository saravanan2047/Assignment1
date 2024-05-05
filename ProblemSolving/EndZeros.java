package ProblemSolving;

import java.util.Scanner;

public class EndZeros {

	public static void main(String[] args) 
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the array size:" );
	int [] arr= new int[scan.nextInt()];
	System.out.println("Enter the elements in the array : ");
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=scan.nextInt();			
	}
	int ref=0;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[j]!=0) 
		{
			int temp=arr[j];
			arr[j]=arr[ref];
			arr[ref]=temp;
			ref++;
		}
	}
	for(int y:arr)
	{
		System.out.println(y+" ");
	}
	}
}
