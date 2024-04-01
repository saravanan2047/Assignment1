package assignment12;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the First number :");
		int num1=scan.nextInt();
		System.out.println("Enter the second Number :");
		int num2=scan.nextInt();
		
		try {
			System.out.println("Division result is : "+(num1/num2));
		}
		catch(ArithmeticException e)
		{
			System.out.println("Cannot divide a number by zero");
		}
	}

}
