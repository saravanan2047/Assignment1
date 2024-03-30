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
		 int res=largestSubarray(arr);
		 int sub[]= new int[res];
		 for(int j=0;j<res;j++)
		 {
			 sub[j]=arr[j];
		 }
		 System.out.println(Arrays.toString(sub));
	}

    public static int largestSubarray(int[] arr) {
        int maxLen = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) 
        {
            count += (arr[i] == 1) ? 1 : -1;
            if (count == 0) 
                maxLen = i + 1;
            
            if (map.containsKey(count)) 
                maxLen = Math.max(maxLen, i - map.get(count));
      
            else 
                map.put(count, i);
        }
        return maxLen;
    }
}
