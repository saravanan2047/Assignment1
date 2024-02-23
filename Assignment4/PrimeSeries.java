import java.util.*;
class HelloWorld 
{
   public static boolean isPrime(int x)
    {
        int c=0;
        for(int j=2;j<=x/2;j++)
        {
            if(x%j==0)
            {
                c=-1;
                break;
            }
        }
        if(c!=-1) return true;
        else return false;
    }
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        for(int i=2;i<=30;i++)
        {
            if(isPrime(i)) System.out.println(i); 
        }
    }
}