package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareGenerate {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Length  of rectangle: ");
		int length=scan.nextInt();
		System.out.println("Enter the  Breadth  of rectangle : ");
		int  breadth=scan.nextInt();
		int side=findGCD(length,breadth);
		
		int  area=side*side;
		System.out.println("Number of Squares can formed are  : "+(length*breadth)/area);
	}
	public static int findGCD(int l,int b)
	{
		while(b!=0)
		{
			int temp=l%b;
			l=b;
			b=temp;
		}
		return l;
	}
	

}
