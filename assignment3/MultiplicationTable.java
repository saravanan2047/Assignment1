import java.util.*;

public class GreatestOfThree
{
    public static void main(String args[]) 
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter Number:");
      int n=scan.nextInt();
      System.out.println("Enter the Range you want to print");
      int range=scan.nextInt();
      for(int i=1;i<=range;i++)
	{
	   System.out.println(n+" * "+i+" = "+(n*i));
	}
      
    }
}