package Assignment7;

import java.util.Scanner;

public class CharacterPresent {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str=scan.next();
		System.out.println("Enter the Character to check :");
		char ch=scan.next().charAt(0);
		boolean bol=isChar(str,ch);
		System.out.println(bol==true?"Character "+ch+" is present in String "+str:"Character "+ch+" is not present in String "+str);
	}
	public static boolean isChar(String s,char c)
	{
		if(s.length()==0) return false;
		
		else if(s.charAt(0)==c)  return true;

		else return  isChar(s.substring(1),c);
		
	}
}
