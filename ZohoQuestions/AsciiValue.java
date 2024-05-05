package ZohoQuestions;
//8) Program to Find ASCII Value of a Character
import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args)
	{
	Scanner scan= new Scanner(System.in);
	System.out.println("Enter the Character: ");
	char c=scan.next().charAt(0);
	int x=c;
	System.out.println("ASCII value of the character is :"+x);
	
	}

}
