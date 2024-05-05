package ProblemSolving;

import java.util.Scanner;

public class DivideBy3 {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number : ");
		String num=scan.next();
		long sum=0;
	
		for(int i=0;i<num.length();i++)
		{
			sum+=Integer.parseInt(num.substring(i,i+1));
		}
		System.out.println(sum);
		System.out.println(sum%3==0?"Yes":"No");

	}

}
