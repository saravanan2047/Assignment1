package dsa.sorting;

import java.util.Scanner;

public class QuickSort {

	// pivotal type 
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
		
		quickSort(arr, 0, arr.length-1);
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		
	}

	private static void quickSort(int[] arr, int start, int end) {
		
		if(start>=end) return;
		int pivot=partition(arr, start, end);
		quickSort(arr, start, pivot-1);
		quickSort(arr,pivot+1, end);
	}

	private static int partition(int[] arr, int start, int end) {
		int p=arr[end];
		int i=start-1;
		for(int j=start;j<=end;j++)
		{
			if(arr[j]<p)
			{
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[end];
		arr[end]=temp;
		return i;
	}

}
