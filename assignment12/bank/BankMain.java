package assignment12.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		Bank bank= new Bank();
		while(true)
		{
			System.out.println("Enter the choice\n1) Deposite \n2) Withdraw \n3) Check Balance \n0) Exit ");
			String choice= scan.next();
			switch(choice)
			{
			case "1": System.out.println("Enter amount to deposit :");
				double amount=scan.nextDouble();
				bank.deposite(amount);
				break;
			case "2": System.out.println("Enter the amount to wothdraw : ");
					double amount1=scan.nextDouble();
					bank.withDraw(amount1);
					break;
			case "3": System.out.println("Current Balance is : "+bank.getBalance());
					break;
			case "0": break;
			default: System.out.println("Enter a valid Option..!!!");
				
			}
			if(choice.equals("0"))
				break;
		}	
	}

}
