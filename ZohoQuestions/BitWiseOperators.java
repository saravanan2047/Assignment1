package ZohoQuestions;
//2) Write a program to define the functionality of a Bitwise operators.
import java.util.Scanner;

public class BitWiseOperators {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		//AND operator
		
		System.out.println("And operation of a & b :"+(a & b));
		//OR operator
		
		System.out.println("OR operation of a | b :"+(a | b));
		//XOR operator
		 
		System.out.println("XOR operation of a ^ b :"+(a ^ b));
		//Left Shift operator
		
		System.out.println("LEFT Shift operation of a << b :"+(a << b));
		//Right Shift operator
	
		System.out.println("RIGHT Shift operation of a >> b :"+(a >> b));
		//NOT operator
		 
		System.out.println("NOT operation of  ~ b :"+(~ b));
		
		
		

	}

}
