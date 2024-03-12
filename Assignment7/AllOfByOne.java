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
		
		int res=checkAll(numArr1,0,numArr2,0);
		System.out.println(res);
		System.out.println(res==numArr1.length?true:false);
	}
	public static int checkAll(int[] arr1,int index1, int[] arr2,int index2)
	{
		
		if(arr1.length==arr2.length && (index1<arr1.length))
		{
			if(arr1[index1]==(arr2[index2]-1)) return checkAll(arr1,index1+1,arr2,index2+1)+1;
			else return 0;
		}
	
				
				
		else return 0;
	}

}
