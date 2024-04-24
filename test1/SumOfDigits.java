package test1;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the First Array Size: ");
		int [] num1= new int[scan.nextInt()];
		System.out.println("Enter the Elements in the array : ");//[4,1,2,3,1,2,5,2]
		// taking input
		for(int i=0;i<num1.length;i++)
		{
			num1[i]=scan.nextInt();
		}
		System.out.println("Enter the Second  Array Size: ");
		int [] num2=new int[scan.nextInt()];
		System.out.println("Enter the Elements in the array : ");//[4,1,2,3,1,2,5,2]
		// taking input
		for(int i=0;i<num2.length;i++)
		{
			num2[i]=scan.nextInt();
		}
		int len=Math.max(num1.length, num2.length);
		int [] result= new int[len+1];
		int carry=0;
		int i=num1.length-1;
		int j=num2.length-1;
		while(i>=0 && j>=0) {
			 int sum=num1[i]+num2[j]+carry;
			if(sum>9)
			{
				result[len--]= sum%10;
				carry=1;
			}
			else {
				result[len--]= sum;
				carry=0;

			}
			i--;
			j--;
		}
		while(i>=0)
		{
			result[len--]= carry+num1[i];
			i--;
			carry=0;
		}
		while(j>=0)
		{
			result[len--]= carry+num2[j];
			carry=0;
		j--;
			
		}
		if(carry==1) result[0]=1;
		int x=0;
		if(result[0]==0) x=1;
		
		for(int k=x;k<result.length;k++)
		{
			System.out.print(result[k]+" ");
		}
		System.out.println();
				
	}

}
