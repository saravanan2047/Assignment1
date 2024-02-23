import java.util.*;

public class GreatestOfThree
{
    public static void main(String args[]) 
    {
      Scanner scan= new Scanner(System.in);
      System.out.println("Enter Students Marks :");
      int marks=scan.nextInt();
      System.out.println("Grade Of the student is :");
      if(marks>=90 && marks<=100) System.out.print("O");
      else if (marks>=80 && marks<90) System.out.print("A+");
      else if (marks>=70 && marks<80) System.out.print("A");
      else if(marks>=60 && marks<70) System.out.println("B+");
      else if (marks>=50 && marks<60) System.out.println("B");
      else if(marks>=40 && marks<50) System.out.println("C");
      else System.out.println("F");
      
    }
}