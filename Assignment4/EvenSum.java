import java.util.*;
class HelloWorld 
{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int arr[]= new int[scan.nextInt()];
        int s=0;
        System.out.println("Enter the elements in the array");
        for(int i=0;i<arr.length;i++) arr[i]=scan.nextInt();

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2!=0)  continue;
            else s+=arr[i];
        }
        System.out.println("the sum of the even numbers in the array is : "+s);
    }
}