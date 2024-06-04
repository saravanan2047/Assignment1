package dsa.sorting;

import java.util.Scanner;

public class SelectionSort {

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
		for(int i=0;i<arr.length;i++)
		{
			int pos=i;
			int min=arr[i];
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[pos];
			arr[pos]=temp;
			
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
