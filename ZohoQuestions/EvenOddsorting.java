package ZohoQuestions;

import java.util.Scanner;

/*18) Write a program to sort the elements in odd positions in descending order and
elements in ascending order.
Eg 1:  Input:  13,2 4,15,12,10,5
         Output: 13,2,12,10,5,15,4
                
Eg 2:  Input: 1,2,3,4,5,6,7,8,9
         Output: 9,2,7,4,5,6,3,8,1
                                  */
public class EvenOddsorting 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the elements in the array :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int j=0;j<arr.length;j++)
		{
			if(j%2!=0 )
			{
			for(int k=0;k<=arr.length-1-j;k++) 
				{
					if(arr[j]>arr[j+1])
					{
						int temp;
						temp=arr[k+1];
						arr[k+1]=arr[k];
						arr[k]=temp;
					}
				}
			}
			if(j%2==0)
			{
				for(int k=0;k<=arr.length-2-j;k+=2) 
				{
					if(arr[k]<arr[k+2])
					{
						int temp;
						temp=arr[k+2];
						arr[k+2]=arr[k];
						arr[k]=temp;
					}
				}
			}
			
		
		}
		System.out.println("Sorted array is : ");
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
	}

}
