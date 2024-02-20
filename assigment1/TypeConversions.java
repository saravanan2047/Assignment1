package assigment1;

import java.util.Scanner;

public class TypeConversions 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the values : ");
		byte a=scan.nextByte();
		short b=scan.nextByte();
		char g=scan.next().charAt(0);
		int c=scan.nextInt();
		long d=scan.nextLong();
		
		float e=scan.nextFloat();
		double f=scan.nextDouble();
		
		//explicit conversion double to all
		System.out.println("Converting double to float : "+(float) f);
		System.out.println("converting double to long : "+(long)f);
		System.out.println("Converting double to int : "+(int)f);
		System.out.println("Converting double to char : "+(char)f);
		System.out.println("Converting double to short : "+(short)f);
		System.out.println("Converting double to byte : "+(byte)f);
		
		// implicit conversion
		System.out.println("Conversion of int to long : "+(long)c);
		System.out.println("Conversion of int to double : "+(double)c);
		System.out.println("conversion of int to float : "+(float)c);
		
		// explicit conversion 
		System.out.println("Conversion of char to int : "+(int) g);
		System.out.println("Converion of char to byte : "+(byte)g);
	}

}
