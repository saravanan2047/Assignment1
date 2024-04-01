package assignment12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PhoneNumber {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		try {
			System.out.println("Enter the Phone Number: ");
			long phoneNum=scan.nextLong();
			System.out.println("Phone Number: "+phoneNum);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Enter correct number..");
//			System.out.println(ime.getMessage());
//			ime.printStackTrace();
		}

	}

}
