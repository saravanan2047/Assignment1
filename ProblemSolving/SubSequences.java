package ProblemSolving;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SubSequences 
{	    
	  public static List<String> printSubsequences(String s) 
	    {
	    	List<String> res= new ArrayList<String>();
	    	res.add("");
//	    	char [] ch= ;
	    	for(char ch :s.toCharArray())
	    	{
	    		int n=res.size();
	    		for(int j=0;j<n;j++)
	    		{
	    			String temp=res.get(j)+ch;
	    			res.add(temp);
	    		}
	    	}
	    	return res;
	    }
	 
	    public static void main(String[] args) 
	    {
	        String s = "abc";
	        System.out.println("All subsequences of '" + s + "' are:");
	        List<String> res=printSubsequences(s);
	        System.out.println(res);
	    }

}
//	    public static void printSubsequences(String s) 
//	    {
//	        int n = s.length();
//	        int totalSubsequences = (int) Math.pow(2, n);
//	        for (int i = 0; i < totalSubsequences; i++) 
//	        {
//	            StringBuilder subsequence = new StringBuilder();
//	            for (int j = 0; j < n; j++) 
//	            {
//	                if ((i & (1 << j)) > 0) 
//	                {
//	                    subsequence.append(s.charAt(j));
//	                }
//	            }
//	            
//	            System.out.println(subsequence);
//	        }
//	    }
	    
	  
/* public static void printSubsequences(String s) {
        printSubsequencesHelper(s, "");
    }
    
    private static void printSubsequencesHelper(String s, String current) {
        // Base case: when the input string becomes empty
        if (s.length() == 0) {
            System.out.println(current);
            return;
        }
        
        // Recursive case: include the first character of the string
        // and recursively call the function with the remaining characters
        printSubsequencesHelper(s.substring(1), current + s.charAt(0));
        
        // Recursive case: exclude the first character of the string
        // and recursively call the function with the remaining characters
        printSubsequencesHelper(s.substring(1), current);
    }

    public static void main(String[] args) {
        String s = "abc";
        System.out.println("All subsequences of '" + s + "' are:");
        printSubsequences(s);
    }*/