package zohoTask2;

import java.util.Scanner;

public class ParenthesisString {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the pattern");
		String s=scan.next();
		System.out.println(parenStr(s));

	}
	public static String parenStr(String str) 
	{
	  if (str.equals("")) return str;
	  if (str.charAt(0) == '(') {
	    if (str.charAt(str.length()-1) == ')')
	      return str;
	    else 
	      return parenStr(str.substring(0, str.length()-1));
	  } else
	    return parenStr(str.substring(1));
	  
	}


}
