package Assignment7;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to find root: ");
		int x=scan.nextInt();
	
		        if(x<1)System.out.println(0);
		        if(x==1) System.out.println(1);
		        long itr=1;
		        long pow=itr*itr;
		        while(x>=pow)
		        {
		            itr++;
		            pow=itr*itr;
		        }
		        System.out.println("Square Root of number "+x+" is: "+((int)itr-1));
		        


	}

}
