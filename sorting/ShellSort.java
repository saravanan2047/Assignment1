package dsa.sorting;

import java.util.Scanner;

public class ShellSort {

	// In general it is the optimization of insertion sort
	// it is gap based sorting
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the elements in the array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array before Sorting :  ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		System.out.println("\nAfter sorting : \n");
		shellSort(arr);
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}
	public static void shellSort(int arr[])
	{
		int n=arr.length;
		
		for(int gap=n/2;gap>0;gap/=2) // splitting the gap
		{
			for(int i=gap;i<n;i++)
			{
				int temp=arr[i];
				int j;
				for(j=i;j>=gap && arr[j-gap]>temp;j-=gap)
				{
					arr[j]=arr[j-gap];
				}	
				
				arr[j]=temp;
				
			}
		}
	}

}
