package ProblemSolving;

import java.util.Scanner;

public class FlightSeat {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Seat NUmber : ");
		int seat=scan.nextInt();
		if(seat>=1 && seat<=103)
		{
			if(seat%6==1 || seat%6==0) System.out.println("Window seat");
			else if(seat%6==2 || seat%6==5) System.out.println("Middel seat");
			else if(seat%6==3 || seat%6==4) System.out.println("Asile seat");
		}
	}

}
