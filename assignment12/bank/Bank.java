package assignment12.bank;

public class Bank 
{
	double balance;
	String bankName;
	
	Bank(String name)
	{this.bankName=name;}
	

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName()
	{
		return bankName;
	}
	public void deposite(double money)
	{
		balance+=money;
		System.out.println(money+" $ Deposited successfully...\n");
	}
	
	public void withDraw(double money)
	{
		try {
			if(money<balance)
			{
			balance-=money;
			System.out.println("\nMoney Withdrawn Successfully....\n");
			}
			else
				throw new InsufficientBalanceException("\nInsufficient balance enter amount less than current balance...\n");
			}
		catch (InsufficientBalanceException e)
		{
//			e.printStackTrace();
		
		}	
	}
	
	

}
