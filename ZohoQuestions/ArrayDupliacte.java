package ZohoQuestions;
/*Java Program to print the duplicate elements of an array*/
public class ArrayDupliacte {

	public static void main(String[] args) 
	{
		int arr[]=new int[] {1,2,1,5,8,5,96,3,3};

	     System.out.println("Duplicate elements in given array: ");  
	     //Searches for duplicate element  
	     for(int i = 0; i < arr.length; i++) 
	     {  
	       for(int j = i + 1; j < arr.length; j++) 
	       {  
	          if(arr[i] == arr[j])  
	          System.out.println(arr[j]);  
	            
	       }  
	       } 
	}

}
