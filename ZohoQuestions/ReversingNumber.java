package ZohoQuestions;

import java.util.Scanner;

/*9) Write a program to display the number in reverse order without use of String
functions.
Eg 1:  Input: 12345
Output :The number in reverse order is : 54321
*/
public class ReversingNumber
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number");
		int x=scan.nextInt();
		int n=0;
		while(x>0)
		{
			int rem=x%10;
			n=n*10+rem;
			x=x/10;
		}
		System.out.println("reversed number is:"+n);

	}

}
