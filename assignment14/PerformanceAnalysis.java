package assignment14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerformanceAnalysis {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		List<Integer> list1= new ArrayList<>();
		List<Character> list2= new ArrayList<>();
		System.out.println("Enter the size of first list ");
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			list1.add(i+1);
		}
		long time1=System.nanoTime();
		System.out.println(time1+"nano seconds to add elements.");
		
		System.out.println("Sequential access for list 1");
		for(int i=0;i<list1.size();i++)
		{
			System.out.println(list1.get(i));
		}
		long time2=System.nanoTime();
		System.out.println(time2+" nano seconds to print list elements");
		System.out.println(list1.remove(0));
		long time3=System.nanoTime();
		System.out.println(time3+" nano seconds to remove a element");
		System.out.println(list1.contains(2)+"\n");
		long time4=System.nanoTime();
		System.out.println(time4+" nano seconds to check a element presence");
		System.out.println("Enter the size of Second list ");
		int m=scan.nextInt();
		for(int i=0;i<m;i++)
		{
			list2.add((char)('a'+i));
		}
		long sec1=System.nanoTime();
		System.out.println(sec1+" nano seconds to add elements.");
		System.out.println("Sequential access for list 2");
		for(char c:list2)
		{
			System.out.println(c);
		}
		long sec2=System.nanoTime();
		System.out.println(sec2+" nano seconds to print list elements");
		System.out.println();
		System.out.println(list2.remove(0));
		long sec3=System.nanoTime();
		System.out.println(sec3+" nano seconds to remove a element");
		System.out.println(list2.contains('f')+"\n");
		long sec4=System.nanoTime();
		System.out.println(sec4+" nano seconds to check a element presence");

	}

}
