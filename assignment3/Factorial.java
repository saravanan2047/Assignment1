import java.util.*;

public class Main {
    public static void main(String[] args) 
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter the number : ");
      int n= scan.nextInt();
      int fact=1;
      for(int i=2;i<=n;i++)
      {
        fact*=i;
      }
      System.out.println("Factorial of the given number is : "+fact);
  }
}