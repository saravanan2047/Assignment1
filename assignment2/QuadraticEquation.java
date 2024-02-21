package assignment2;

import java.util.Scanner;

public class QuadraticEquation 
{
		public static void main(String[] args) 
		{
			Scanner scan = new Scanner(System.in);
			System.out.print("Enter the value of a: ");
			double a = scan.nextDouble();
			 System.out.print("Enter the value of b: ");
			 double b = scan.nextDouble();
			 System.out.print("Enter the value of c: ");
			 double c = scan.nextDouble();
			  double discriminant = b * b - 4 * a * c;
			  if (discriminant < 0)
			  {
			     System.out.println("The roots are complex numbers. Quadratic equation has no real roots.");
			  }
			  else if (discriminant == 0) 
			  {
			      double root = -b / (2 * a);
			      System.out.println("The root of the quadratic equation is: " + root);
			  }
			  else 
			  {
			     double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
			     double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
			     System.out.println("The roots of the quadratic equation are: " + root1 + " and " + root2);
			   }	      
		}
}
