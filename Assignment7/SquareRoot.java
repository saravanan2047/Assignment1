package Assignment7;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number to find root: ");
		int num=scan.nextInt();
	
		        if(num<1)System.out.println(0);
		        if(num==1) System.out.println(1);
		        int itr=1;
		       
		        while(num>itr*itr)
		        
		            itr++;
		        
		        if(num==itr*itr) 
		        		System.out.println(itr);	
		        
		        else if(Math.abs(itr*itr-num)>Math.abs((itr-1)*(itr-1)-num)) 
		        		System.out.print(itr-1);
		        else
		        	System.out.println(itr);
	}

}
