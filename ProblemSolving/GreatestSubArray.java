package ProblemSolving;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GreatestSubArray 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the length of the array: ");
		int size=scan.nextInt();
		int arr[]= new int[size];// {1, 0, 1, 1, 1, 0, 0}
		for(int i=0;i<size;i++)
		{
			arr[i]=scan.nextInt();
		}
		 int res[]=findMaxLength(arr);
		 int sub[]= new int[res[1]-res[0]+1];
		 for(int j=res[0];j<res[1];j++)
		 {
			 sub[j]=arr[j];
		 }
		 System.out.println(Arrays.toString(sub));
	}

	public static int[] findMaxLength(int[] nums) {
		        int sum = 0;
		        int maxsize = -1;
		        int startindex = 0;
		        int endindex = 0;
		        int arr[]= new int[2];
		        for (int i = 0; i < nums.length - 1; i++) 
		        {
		            sum = (nums[i] == 0) ? -1 : 1;
		            for (int j = i + 1; j < nums.length; j++) 
		            {
		                if (nums[j] == 0)
		                    sum += -1;
		                else
		                    sum += 1;
		                if (sum == 0 && maxsize < j - i + 1) 
		                {
		                    maxsize = j - i + 1;
		                    startindex = i;
		                }
		            }
		        }
		        endindex = startindex + maxsize - 1;
		        arr[0]=startindex;
		        arr[1]=endindex;
		        return arr;
		    }
}
