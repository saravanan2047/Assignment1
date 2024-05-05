package zohoTask2;

import java.util.Arrays;
import java.util.Scanner;

public class UniqueElements 
{

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the size of the arary");
		int arr[]=new int[scan.nextInt()]; //{3,3,4,5,5,6,7,7,7}
		int count=1;
		System.out.println("Enter the elements in the array :");
		for(int j=0;j<arr.length;j++)
		{
			arr[j]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Index is : ");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]!=-1 && arr[i]==arr[j])
				{
					arr[j]=-1;
					count++;
				}
				else break;
			}
		}
		System.out.println(count-1);
	}

}
/*import java.util.Arrays;

public class RemoveDupli{
    public static void main(String[] args) 
    {
        int[] arr = {3,3,4,5,5,6,7,7,7};
        int left = 0;
        int index = 0;
        while(left < arr.length)
        {
            while(left < arr.length -1 && arr[left] == arr[left+1])
            {
                left+=1;
            }
            arr[index] = arr[left];
            index+=1;
            left+=1;
        }
        int temp = index;
        for( ; temp<arr.length;temp++)
        {
            arr[temp] = 0;
        }  
        System.out.println("Index : "+(index-1));
        System.out.println(Arrays.toString(arr));
    }

}*/
