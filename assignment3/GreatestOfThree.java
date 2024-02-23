import java.util.*;

public class GreatestOfThree
{
    public static void main(String args[]) 
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("enter the Numbers :");
      int a=scan.nextInt();
      int b=scan.nextInt();
      int c=scan.nextInt();
      if(a>b && a>c) System.out.println("A is Greatest");
      else if(b>c) System.out.println("B is Greatest ");
      else System.out.println("C is Greatest");
    }
}