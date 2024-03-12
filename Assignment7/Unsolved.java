package Assignment7;

import java.util.Scanner;

public class Unsolved {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number :");
		int num=scan.nextInt();
		System.out.print(num+" ");
		while(num!=1 && num!=0)
		{
			if(num%2==0) 
				{
					num=num/2;
					System.out.print(num+" ");
				}
			else 
			{
				num=num*3+1;
				System.out.print(num+" ");
			}
		}
	}
}
