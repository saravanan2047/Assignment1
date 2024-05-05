package ProblemSolving;

import java.util.Scanner;
import java.util.Stack;

public class Decode {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter the coded String :"); //IIDID-->124365 (length<=8)
		String code=scan.next();
		System.out.println(deCode(code));
	}
    public static String deCode(String code) 
    {
        if (code == null || code.isEmpty()) 
        {
            return "";
        }
        int n = code.length();
        int[] result = new int[n + 1];
        Stack<Integer> CodeStack = new Stack<>();
        int j = 0;
        for (int i = 0; i <= n; i++) 
        {
        	CodeStack.push(i +1);//< 5,6 >
            if (i == n || code.charAt(i) == 'I') 
            {
                while (!CodeStack.isEmpty()) 
                {
                    result[j++] = CodeStack.pop(); //[1,2,4,3,6,5]
                }
            }
        }
        
        StringBuilder decode= new StringBuilder();
        for (int num : result) 
        {
            decode.append(num);
        }

        return decode.toString();
    }

}

