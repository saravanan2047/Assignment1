package ZohoQuestions;
//13) Java Program to print the smallest element in an array
import java.util.Scanner;

public class ArraySmallestElement 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int arr[]= new int[scan.nextInt()];
		// Storing the elements in the array
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int min=arr[0]; // assigning the first element as smallest element
		for(int i=0;i<arr.length-1;i++)
		{
			if(min>arr[i+1]) // checking the min element with other array element
			{
				min=arr[i+1];
			}
		}
		System.out.println("The smallest element in the array is :"+min);
		
	}

}
