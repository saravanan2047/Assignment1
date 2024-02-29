package Assignment5;

import java.util.Arrays;
import java.util.Scanner;

public class RightShiftArray
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the lengt of the Array : ");
		int arr[]= new int[scan.nextInt()];
		System.out.println("Enter the elements : ");
		for(int i=0;i<arr.length;i++)
			arr[i]=scan.nextInt();
		
		System.out.println("Enter the numbe of rotation :");
		int [] result= new int[arr.length];
		int rotate=scan.nextInt();
		for(int i=0;i<arr.length;i++)
			{
				int temp=(rotate+i)%arr.length;
				result[temp]=arr[i];
			}
		System.out.println(Arrays.toString(result));
}

}
