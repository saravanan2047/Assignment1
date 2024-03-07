package combinedAssignment1;

import java.util.Scanner;

public class UnderstandingScopeOfVariable 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num1=scan.nextInt();
		if(10>3)
		{
			System.out.println("Inside the if block enter any number : ");
			int num2=scan.nextInt();
			
			System.out.println(num1);;
			System.out.println(num2);
		}
		System.out.println("\n Outside Of IF block : ");
		System.out.println(num1);
		//System.out.println(num2); //num2 cannot be resolved to a variable

	}

}
