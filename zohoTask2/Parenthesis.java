package zohoTask2;

import java.util.Scanner;

public class Parenthesis 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the pattern");
		String s=scan.next();
		System.out.println(paraVal(s));
	}
	public static  boolean paraVal(String str) 
	{
	  if (str.equals("")) return true;
	  if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')')
	    return paraVal(str.substring(1,str.length()-1));
	  else
		  return false;
	}
}
