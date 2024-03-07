package combinedAssignment1;

import java.util.Scanner;

public class AverageWeightOfTen 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		float [] weights= new float[10];
		float sum=0;
		System.out.println("Enter the weights of persons : ");
		for(int i=0;i<10;i++)
		{
			weights[i]=scan.nextFloat();
		}
		
		for(float i:weights)
		{
			sum+=i;	
		}
		System.out.println("Average weight of ten peoples is :"+sum/10+"Kg");
		
		

	}

}
