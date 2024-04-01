package assignment12;

import java.util.Scanner;

public class ArrayIndex {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		int arr[]= {1,5,9,6,4,3,7,10};
		
		try
		{
			System.out.println("Enter the index ot print the element of the array : \n");
			int index=scan.nextInt();
			System.out.println("Element at "+index+" position is : "+arr[index]);
			
		}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Index is out of range ....please enter the correct index.\n");
//			ae.printStackTrace();
			System.out.println(ae.getMessage());
		}

	}

}
