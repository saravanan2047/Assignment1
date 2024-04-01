package assignment12.bank;

public class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String message)
	{
		System.out.println(message);
	}

}
