package ZohoQuestions;
/*28) Write a program to find the sum of the series. The series will be like 1 +11 + 111 +
1111 +.. n terms.
Eg 1: Input:  Input the number of terms : 5
Output :
1 + 11 + 111 + 1111 + 11111
The Sum is : 12345
Eg 2: Input:  Input the number of terms : 3
Output :
1 + 11 + 111
The Sum is : 123*/
import java.util.Scanner;

public class OneSeriesSum {

	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter the numbre: ");
		int x=scan.nextInt();
		int sum=0;
		String o="1";
		for(int i=1;i<=x;i++)
		{
			o=o.repeat(i);
			sum+=Integer.parseInt(o);
			o="1";
		}
		System.out.println("the sum is :"+sum);

	}

}
