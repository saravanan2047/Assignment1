package ZohoQuestions;
//12) Program to Check Whether a Character is an Alphabet or not
public class AlphabetOrNot {

	public static void main(String[] args)
	{
		char c='A';
		int x=c;
		if((x>=65 && x<=90) || (x>=97 && x<=122))
		{
			System.out.println("It is a chracter");
		}
		else
		{
		System.out.println("Not a character");
		}

	}

}
