package ZohoQuestions;

import java.util.Scanner;

/*10) Using Recursion, reverse the string such as
Eg 1:  Input: one two three
       Output: three two one
Eg 2:  Input: I love india
       Output: india love I
*/
public class RecurssionString 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the Sentence :");
		String str=scan.nextLine();
		System.out.println(reverse(str));
	}

	  public static String reverse(String inputStr) 
	  {
	        // Base case: if the sentence is empty or has only one word
	        if (inputStr.isEmpty() || !inputStr.contains(" ")) 
	        {
	            return inputStr;
	        }

	        // Recursive case: reverse the substring after the first space,
	        // and append the first word at the end
	        int space = inputStr.indexOf(" ");
	        String firstWord = inputStr.substring(0, space);
	        String remainingSentence = inputStr.substring(space + 1);
	        return reverse(remainingSentence) + " " + firstWord;
	    }
		

}
