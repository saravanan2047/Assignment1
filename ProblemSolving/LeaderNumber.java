package ProblemSolving;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeaderNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];//{16,17,4,3,5,2}
        System.out.println("Enter the Numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        List<Integer> res = new ArrayList<>();
        int maxRight = arr[n - 1]; // Rightmost element is always a leader
        res.add(maxRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxRight) {
                maxRight = arr[i];
                res.add(maxRight);
            }
        }
        for (int i = res.size() - 1; i >= 0; i--) {
            System.out.print(res.get(i) + " ");
        }
    }
//public class LeaderNumber {
//
//	public static void main(String[] args) 
//	{
//		Scanner scan= new Scanner(System.in);
//		System.out.println("Enter the Size :" );
//		int [] arr= new int[scan.nextInt()];
//		System.out.println("Enter the Numbers : ");
//		for(int i=0;i<arr.length;i++)
//		{
//			arr[i]=scan.nextInt();			
//		}
//		List<Integer> res= new ArrayList<>();
//		for(int i=0;i<arr.length;i++)
//		{
//			int leader=arr[i];
//			boolean stat=false;
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(leader>arr[j]) 
//					stat=true;	
//				else 
//				{
//					stat=false;
//					break;
//				}
//			}
//			if(stat) res.add(leader);
//		}
//		res.add(arr[arr.length-1]);
//		for(int h:res)
//		{
//			System.out.print(h+" ");
//		}
//	}
//
//}

}
