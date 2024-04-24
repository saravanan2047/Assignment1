package test1;

import java.util.Scanner;

public class MaxSubArraySum {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the First Array Size: ");
		int [] num= new int[scan.nextInt()];
		System.out.println("Enter the Elements in the array : ");//[2,7,5,-1,-3,2,9,7]
		// taking input
		for(int i=0;i<num.length;i++)
		{
			num[i]=scan.nextInt();
		}
		int max=Integer.MIN_VALUE;
		int start=0;
		int end=0;
		int sum=0;
	
		for(int i=0;i<num.length;i++)
		{
			sum=0;
			if(num[i]<0) continue;
			else {
			for(int j=i;j<num.length;j++)
			{
				if(num[j]<0) break;
				else 
				{
					sum+=num[j];
					if(sum>max)
					{
						start=i;
						end=j;
						max=sum;
					}
				}
			}
			}	
		}
		System.out.println("Sum of element is "+max+"\nAnd sub array is \n");
		for(int i=start;i<=end;i++)
		{
			System.out.print(num[i]+" ");
		}
	}
}
