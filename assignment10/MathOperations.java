package assignment10;

import java.util.Scanner;

public class MathOperations {

	public static void main(String[] args) 
	{
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter First Number : ");
//		int num1=scan.nextInt();
//		System.out.println("Enter Second Number :");
//		int num2=scan.nextInt();
		add(15,20);
		add("Apple is ","sweet");
		add(125.362,123.654);
		add('A','d');
		System.out.println();
		sub(50,20);
		sub(165.25,96.36); 
		sub('a','Z');
		System.out.println();
		mul(16,5);
		mul(10.34,5.25);
		System.out.println();
		div(500,5);
		div(15.75,2.25);
		

	}
	static void add(int a,int b)
	{
		System.out.println("Addition value of integer is : "+(a+b));
	}
	static void add(double a, double b)
	{
		System.out.println("Addition value of double is : "+(a+b));
	}
	static void add(String a, String b)
	{
		System.out.println("Addition value of strings is : "+(a+b));
	}
	static void add(char a, char b)
	{
		System.out.println("Addition value of Character is : "+(a+b));
	}
	static void sub(int a,int b)
	{
		System.out.println("Substraction value of integer is : "+(a-b));
	}
	static void sub(double a, double b)
	{
		System.out.println("Substraction value of double is : "+(a-b));
	}
	static void sub(char a, char b)
	{
		System.out.println("Substraction value of Character is : "+(a-b));
	}
	static void mul(int a , int b)
	{
		System.out.println("Multiplication value of integer is : "+(a*b));
	}
	static void mul(double a, double b)
	{
		System.out.println("Multiplication value of double is : "+(a*b));
	}
	static void div(int a, int b)
	{
		System.out.println("Division value of integer  is : "+(a/b));
	}
	static void div(double a, double b)
	{
		System.out.println("Division value of double  is : "+(a/b));
	}

}
