package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class IsArraySubset {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array size:" );
		int [] arr= new int[scan.nextInt()];
		System.out.println("Enter the elements in the array1 : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();			
		}
		System.out.println("Enter the size of subset array : ");
		int arr2 []= new int[scan.nextInt()];
		System.out.println("Enter the elements in the array2 : ");
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=scan.nextInt();			
		}
//		int c=0;
//		for(int j=0;j<arr2.length;j++)
//		{
//			for(int k=0;k<arr.length;k++)
//			{
//				if(arr2[j]==arr[k])
//				{
//					c++;
//					break;
//				}
//			}
//		}
//		System.out.println(c==arr2.length?"Subset":"Not a subset");
		
		/* --------- OR ----------*/
		Arrays.sort(arr);
		Arrays.sort(arr2);
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(j<arr2.length && arr[i]==arr2[j] ) j++;
			
		}
		System.out.println(j==arr2.length?"YEs":"No");
		
		
		
		
		

	}

}
