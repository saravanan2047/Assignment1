package assigment1;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args)
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter any two numbers : ");
		int a=scan.nextInt();
		int b= scan.nextInt();
		System.out.println("Before swapping a value is a= "+a+" b value is b= "+b);
		// first way to swap
		int temp=a;
		a=b;
		b=temp;
		
		System.out.println("After swapping by Method 1 is a= "+a+" b = "+b);
		
//		// second way to swap;
//		a=a*b;
//		b=a/b;
//		a=a/b;
//		System.out.println("After swapping by Method 2 is a= "+a+" b = "+b);
//		
//		// third way
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println("After swapping by Method 3 is a= "+a+" b = "+b);
	}

}
