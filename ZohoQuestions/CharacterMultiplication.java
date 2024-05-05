package ZohoQuestions;

import java.util.Scanner;

/* Write a program to give the following output for the given input:
    Eg 1:  Input: a1b10
    Output: abbbbbbbbbb
    Eg: 2:  Input: b3c6d15
           Output: bbbccccccddddddddddddddd
    The number varies from 1 to 99.
*/
public class CharacterMultiplication 
{
	public static void main(String[] args) 
		{
	    	Scanner scan= new Scanner(System.in);
	    	System.out.println("Enter the string: ");
	        String s=scan.next();
	        System.out.println(generateString(s));  
	    }

	static String generateString(String input) 
		{
	        StringBuilder result = new StringBuilder();
	        char currentChar =' ';
	        int repeatCount = 0;

	        for (char ch : input.toCharArray()) 
	        {
	            if (Character.isAlphabetic(ch)) 
	            {
	                // If a new character is encountered, append the repeated character to the result
	                if (repeatCount > 0) 
	                {
	                    result.append(String.valueOf(currentChar).repeat(repeatCount)); 
	                    repeatCount = 0; // Reset repeat count
	                }
	                currentChar = ch;
	            } 
	            else if (Character.isDigit(ch)) 
	            {
	                repeatCount = repeatCount * 10 +(ch - '0'); // Build the repeat count & converting the character digit to numeric value
	            }
	        }

	        // Append the remaining repeated character to the result
	        if (repeatCount > 0) 
	        {
	            result.append(String.valueOf(currentChar).repeat(Math.max(0, repeatCount)));
	        }

	        return result.toString();
	    }
	


}
