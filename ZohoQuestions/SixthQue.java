package ZohoQuestions;
/*6) Evaluate the following expression on paper and on program and understand the
difference
i)++a-b–                   ii)a%b++     iii)a*=b+5               iv)x=69>>>2
*/
public class SixthQue 
{

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		System.out.println("1) "+(++a-b--));
		int c=10;
		int d=5;
		System.out.println("2) "+(c%d++));
		int e=10;
		int f=5;
		System.out.println("3) "+(e*=f+5));//e=e*f+5
		System.out.println("4) "+(69>>>2));
		

	}

}
