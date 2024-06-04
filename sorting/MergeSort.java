package dsa.sorting;

import java.util.Scanner;

public class MergeSort {

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
		System.out.println("\nAfter Sorting ");
		mergeSort(arr);
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
	}
	
	// splitting the arrays into halves
	private static void mergeSort(int[] arr) {
		int len=arr.length;
		if(len<=1) return;
		
		int mid=len/2;
		int leftArr[]=new int[mid];
		int rightArr[] = new int[len-mid];
		int i=0,j=0;
		for(;i<len;i++)
		{
			if(i<mid)
				leftArr[i]=arr[i];
			else
			{
				rightArr[j]=arr[i];
				j++;
			}
		}
		mergeSort(leftArr);
		mergeSort(rightArr);
		sort(leftArr,rightArr,arr);
		
	}
	
	// sorting the half arrays and adding it into the main array

	private static void sort(int[] leftArr, int[] rightArr, int[] arr) {
		int leftSize=arr.length/2;
		int rightSize=arr.length-leftSize;
		int i=0,l=0,r=0;
		
		while(l<leftSize && r<rightSize)
		{
			if(leftArr[l]<rightArr[r])
			{
				arr[i]=leftArr[l];
				l++;
				i++;
			}
			else
			{
				arr[i]=rightArr[r];
				r++;
				i++;
			}
		}
		
		// for remianing elements
		
		while(l<leftSize)
		{
			arr[i]=leftArr[l];
			l++;
			i++;
		}
		while(r<rightSize)
		{
			arr[i]=rightArr[r];
			r++;
			i++;
		}
			
	}

}
