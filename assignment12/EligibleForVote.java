package assignment12;

import java.util.Scanner;

class CustomException extends Exception
{
	CustomException()
	{
		super("Age is Less Not Eligible For Voting ");
	}
}
public class EligibleForVote {

	public static void main(String[] args) throws CustomException {
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter Age");
		int age=scan.nextInt();
		try 
		{
				if(age>=18) 
					System.out.println("Eligible for Voting ");
				else
					throw new CustomException();
		}
		catch(CustomException e)
		{
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
