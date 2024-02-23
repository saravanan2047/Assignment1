import java.util.*;

public class GreatestOfThree
{
    public static void main(String args[]) 
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("enter the Month :");
      int month=scan.nextInt();
      System.out.println("enter the Year :");
      int year=scan.nextInt();
      
      switch(month)
      {
        case 1,3,5,7,8,10,12: System.out.println("Number of days are : 31.");
        break;
        case 2:
          if(year%4==0  && year%100!=0 ||year%400==0) System.out.println("NUmber of days are : 29");
          else System.out.println("Number of days are : 28");
          break;
	case 4,6,9,11: System.out.println("Number of days are : 30");
		break;
          default: System.out.println("Enter a valid month");
      }
    }
}