package assignment12.bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		Bank bank= new Bank("ZSGS BANK Pvt Ltd");
		Account account = new Account("Sam",1212,"Chennai TN");
		System.out.println("Welcome to "+bank.getName()+"\n");
		
		while(true)
		{
			System.out.println("Enter your account number:");
			long accountNum=scan.nextLong();
			System.out.println("Enter your Pin :");
			int pin=scan.nextInt();
			if(accountNum==account.getAccountNo() && pin==account.getPin())
			{
			System.out.println("Enter the choice\n1) Deposite \n2) Withdraw \n3) Check Balance \n0) Exit ");
			String choice= scan.next();
			switch(choice)
			{
			case "1": System.out.println("Enter amount to deposit :");
				double amount=scan.nextDouble();
				bank.deposite(amount);
				break;
			case "2": System.out.println("Enter the amount to withdraw : ");
					double amount1=scan.nextDouble();
					bank.withDraw(amount1);
					break;
			case "3": System.out.println("Current Balance is : "+bank.getBalance()+"\n");
					break;
			case "0": break;
			default: System.out.println("Enter a valid Option..!!!\n");	
			}
			if(choice.equals("0"))
				break;
			}	
			else
			{
				System.out.println("Invalid details enter again or exit..!!!! \n1) Try again \n2) Exit");
				int t=scan.nextInt();
				if(t==1) continue;
				else
					break;
			}
	}
	}

}
