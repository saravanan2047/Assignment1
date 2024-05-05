package ProblemSolving;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num=scan.nextInt();
		System.out.println((num<<4)-num); // multiply of 15
		
		if(num%2==0) 
		{
			System.out.println(((num<<3))-(num>>1)); // multiply of 7.5
		}
		System.out.println(((num<<4)-num)>>4); //15*num/16
		
		
	}

}
