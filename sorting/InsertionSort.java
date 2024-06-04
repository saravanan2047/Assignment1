package dsa.sorting;

import java.util.Scanner;

public class InsertionSort {

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
		for(int i=1;i<arr.length;i++)
		{
			int j=i-1;
			int min=arr[i];
			while(j>=0 && arr[j]>min)
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=min;
		}
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
