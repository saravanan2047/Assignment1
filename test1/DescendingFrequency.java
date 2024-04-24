package test1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DescendingFrequency {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Array Size: ");
		int [] arr=  new int[scan.nextInt()];
		System.out.println("Enter the Elements in the array : ");//[4,1,2,3,1,2,5,2]
		// taking input
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		// getting number of elements present 
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		// resultant array
		int res[]= new int[arr.length];
		int len=0;
		// looping until map gets empty
		while(!map.isEmpty())
		{
			int max=getMax(map); // getting key of max frequency element 
			for(int i=len;i<map.get(max)+len;i++) // looping throught the frequency
			{
				res[i]=max;
			}
			len+=map.get(max); // updating the length
			map.remove(max); // removing the max element so that next max element we can get 
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(res[i]+" ");
		}
	}
	
	// method to return the key of max element
	public static int getMax(Map<Integer,Integer> map)
	{
		int max=Integer.MIN_VALUE;
		int maxKey=0;
//		System.out.println(map);
		 for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
	            if (entry.getValue() > max) {
	                max = entry.getValue();
	                maxKey = entry.getKey();
	            }
	        }
		 return maxKey;
		
	}

}
