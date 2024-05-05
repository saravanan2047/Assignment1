package ZohoQuestions;
/*16) Given two sorted arrays, merge them such that the elements are not repeated
Example 1:
Input: Array 1: 2,4,5,6,7,9,10,13
         Array 2: 2,3,4,5,6,7,8,9,11,15
Output: Merged array: 2,3,4,5,6,7,8,9,10,11,13,15*/
public class SortedMerge 
{
	public static void main(String[] args) 
	{
		int arr1[]=new int[] {2,4,5,7,9,10,12};
		int arr2[]=new int[] {1,2,4,5,6,7,12,16,22,30};
		int res[]=new int[arr1.length+arr2.length];
		int a1=0;
		int a2=0;
		int i=0;
		while(a1<arr1.length && a2<arr2.length)
		{
			if(arr1[a1]==arr2[a2])
			{
				res[i]=arr1[a1];
				a1++;
				a2++;
				i++;
			}
			else if(arr1[a1]>arr2[a2])
			{
				res[i]=arr2[a2];
				a2++;
				i++;
			}
			else if(arr1[a1]<arr2[a2])
			{
				res[i]=arr1[a1];
				a1++;
				i++;
			}	
		}
		// for adding the remaining elements if in arr1
		while(a1<arr1.length)
		{
			res[i]=arr1[a1];
			a1++;
			i++;	
		}
		// for adding the remaining elements if in arr2
		while(a2<arr2.length)
		{
			res[i]=arr2[a2];
			a2++;
			i++;
		}
		//printing the resulted array
		for(int x:res)
		{
			if(x!=0) 
			{
			System.out.print(x+" ");
			}
			else {
			break;}
		}

	}

}
