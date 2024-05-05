package ProblemSolving;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
public class StringPerumutation 
{
	    public static void main(String[] args) 
	    {
	        String S = "ABSG";
	        uniquePermutations(S);
	    }
	    
	    public static void uniquePermutations(String S) 
	    {
	        char[] charArray = S.toCharArray();
	        Arrays.sort(charArray); // Sort the characters in lexicographical order
	        Set<String> set = new TreeSet<>(); // Use TreeSet to automatically sort the permutations
	        
	        // Generate permutations recursively
	        generatePermutations(charArray, 0, set);
	        
	        // Print unique permutations
	        for (String perm : set) {
	            System.out.println(perm);
	        }
	    }
	    
	    private static void generatePermutations(char[] charArray, int index, Set<String> set) 
	    {
	        if (index == charArray.length) 
	        {
	            set.add(new String(charArray)); // Add the permutation to the set
	            return;
	        }
	        
	        // Generate permutations by swapping characters
	        for (int i = index; i < charArray.length; i++) 
	        {
	            swap(charArray, index, i);
	            generatePermutations(charArray, index + 1, set);
	            swap(charArray, index, i); // Backtrack: restore the original array
	        }
	    }
	    
	    private static void swap(char[] charArray, int i, int j) 
	    {
	        char temp = charArray[i];
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	    }
	


}
