package Assignment6;

import java.util.Scanner;

public class EmailVerification 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Ente the email :");
		String str=scan.next();      //sarvana1235@gmail.com
		int pos=str.lastIndexOf("@");
		boolean stat=true;
		int dot=str.lastIndexOf(".");
		
		if(pos!=-1 && str.charAt(pos-1)!='.' &&str.charAt(pos-1)!='@'   && !str.substring(0,pos).matches("-?\\d+(\\.\\d+)?") && !str.startsWith(".")) // checking whether email starts with dot or it only has special character or
		{
			for(int i=0;i<pos;i++)
			{
				if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'
										|| str.charAt(i)>=0 && str.charAt(i)<=9 || str.charAt(i)=='.' )
					stat=true;
				else
				{
					stat=false;
					break;
				}
				
			}
			if(str.substring(dot+1) instanceof String) stat=true; // checking whether the last is string 
			else stat=false;
		}
		else stat=false;
		for(int i=pos+1;i<dot;i++) // checking whether a special character is present b/w @ to .
		{
			int c=(int)str.charAt(i);
			if(c>=32 && c<=47) 
			{
			stat=false;
			break;
			}
		}
		if(stat)
			System.out.println("Email is valid");
		else System.out.println("Email is not valid");
	}

}
