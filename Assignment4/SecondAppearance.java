public class Main
{
    public static void main(String[] args) 
    {
        int num=1;
        int arr[]={1,5,6,5,4,5,2};
        int c=0,pos=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==num)
            {
                c++;
                if(c==2)
                {
                    pos=i;
                    break;
                }
            }
        }
        System.out.println("Element Present at index :"+pos);  
    }
}
