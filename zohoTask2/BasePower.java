package zohoTask2;

import java.util.Scanner;

public class BasePower {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the base");
		int base=scan.nextInt();
		System.out.println("Enter the power ");
		int pow=scan.nextInt();
		System.out.println("The result is : "+power(base,pow));
	}
	public static int power(int b,int p)
	{
		if(p==0 )return 1;
		if(p==1) return b;
		else
			return power(b,p-1)*b;
		
	}

}
