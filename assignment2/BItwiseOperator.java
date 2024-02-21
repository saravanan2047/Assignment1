package assignment2;

import java.util.Scanner;

public class BItwiseOperator 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the numbres : ");
		int x= scan.nextInt();
		int y= scan.nextInt();
		
		System.out.println("Performing AND Operation : "+(x & y));
		System.out.println("Performing OR Operation : "+(x|y));
		System.out.println("Performing XOR Operation : "+(x^y));
		System.out.println("Performing LEFT SHIFT Operation : "+(x<<y));
		System.out.println("Performing RIGHT SHIFT Operation : "+(x>>y));
		System.out.println("Performing UNSIGNED RIGHT SHIFT Operation : "+(x>>>y));
		

	}

}
