package ZohoQuestions;
//14) Java Program to copy all elements of one array into another array
import java.util.Scanner;

public class CopyingElement {

	public static void main(String[] args)
	{
		Scanner scan=  new Scanner(System.in);
		int arr[]=new int[] {12,15,6,8,10};
		int arr2[]=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			arr2[i]=arr[i];
		}
		System.out.print("Copied array element is : ");
		for(int x:arr2)
		{
			System.out.print(x+" ");
		}
	}

}
