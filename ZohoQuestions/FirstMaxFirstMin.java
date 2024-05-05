package ZohoQuestions;

import java.util.Arrays;
import java.util.Scanner;

/*17) Alternate sorting: Given an array of integers, rearrange the array in such a way that
		the first element is first maximum and second element is first minimum.
 		Example:  Input : {1, 2, 3, 4, 5, 6, 7}
		Output: {7, 1, 6, 2, 5, 3, 4}
*/
public class FirstMaxFirstMin 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of array");
		int arr[]= new int[scan.nextInt()];
		System.out.println("enter the elements in the array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int [] nums=new int[arr.length];
		Arrays.sort(arr);
		int j=0;
		int k=0;
		while(j<(arr.length/2))
		{
			nums[k]=arr[arr.length-j-1];
			nums[k+1]=arr[j];
			k+=2;
			j++;
		}
		if(arr.length%2!=0)
		{
			nums[arr.length-1]=arr[(arr.length/2)];	
		}
		for(int x:nums)
		{
			System.out.print(x+" ");
		}
	}
}
