package zohoTask2;

import java.util.Scanner;

public class Contains6 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the array size");
		int size=scan.nextInt();
		int arr[]= new int[size];
		System.out.println("Enter the array element : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println(conSix(arr,0));
	}
	public static boolean conSix( int[]nums,int i )
	{
		
		  if(nums.length==0) return false;
		  if(i<nums.length)
		  {
		    return nums[i]!=6?conSix(nums,i+1):true;
		  }
		  return false;
		  
		

	}

}
