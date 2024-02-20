package assigment1;

import java.util.Scanner;

public class Weekdays 
{
	enum week{
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY
	}

	public static void main(String[] args)
	{
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the number between 1-7");
		int x=scan.nextInt();
		if(x==1)
		{
		System.out.println(week.MONDAY);
		}
		else if(x==2)
		{
			System.out.println(week.TUESDAY);
		}
		else if(x==3)
		{
			System.out.println(week.WEDNESDAY);
		}
		else if(x==4)
		{
			System.out.println(week.THURSDAY);
		}
		else if(x==5)
		{
			System.out.println(week.FRIDAY);
		}
		else if(x==6)
		{
			System.out.println(week.SATURDAY);
		}
		else
		{
			System.out.println(week.SUNDAY);
		}

	}

}
