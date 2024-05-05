package ProblemSolving;

import java.util.Scanner;

public class MinHealth {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the no of health");
		int arr[]=new int[scan.nextInt()];
		System.out.println("Enter the health : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();//[1,5,6,2]
			
		}
		int gcd=arr[0];
		int j=1;
		while(j<arr.length)
		{
			gcd=findGcd(gcd,arr[j]);
			j++;
		}
		System.out.println("Min health is : "+gcd);
	}
	public static int findGcd(int x,int y)
	{
		while(y!=0)
		{
			int temp=x%y;
			x=y;
			y=temp;
		}
		return x;
	}

}
/*Problem Contest - 1 

Question - 11

	public int lastStandWins(int health[]) {
		Arrays.sort(health);

		int minHealth = health[0];
		int lowestHealth = 1;
		int count = 0;

		for (int i = minHealth; i > 0; i--) {
			for (int j = 0; j < health.length; j++) {
				if (health[j] % i == 0) {
					lowestHealth = i;
					count++;
				} else {
					count = 0;
					break;
				}
			}
			if (count == health.length) {
				return lowestHealth;
			}
		}
		return lowestHealth;
	}*/
