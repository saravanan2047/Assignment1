package ZohoQuestions;
/*7) Evaluate the following expression on paper and on program and understand the
difference
a+=a++ + ++a + –a + a–; when a=28
*/
public class EighthQue 
{

	public static void main(String[] args) 
	{
		int a=28;
		a+=a++ + ++a + --a + a--;
		System.out.println(a); //144

	}

}
