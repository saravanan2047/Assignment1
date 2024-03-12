package Assignment7;

import java.util.Scanner;

public class AllOfByOne {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of First array : ");
		int[] numArr1=new int[scan.nextInt()]; //{1,2}
		System.out.println("Enter the elements in the First array :");
		for(int i=0;i<numArr1.length;i++)
		{
			numArr1[i]=scan.nextInt();
			
		}
		System.out.println("Enter the size of second array : ");
		int [] numArr2=new int[scan.nextInt()];//{2,3}
		System.out.println("Enter the elements in the Second array :");
		for(int i=0;i<numArr2.length;i++)
		{
			numArr2[i]=scan.nextInt();
			
		}
		
		boolean res=checkAll(numArr1,numArr2,0);
		System.out.println(res);
	}
	public static boolean checkAll(int[] arr1, int[] arr2,int index)
	{
		
		if(arr1.length!=arr2.length) return false;
		
		if(index>=Math.max(arr1.length,arr2.length)) return true;
		
		if(arr1[index]==(arr2[index]-1) && (index<Math.max(arr1.length,arr2.length)))
		
				return checkAll(arr1,arr2,index+1);
		else 
				return false;	
	}

}
