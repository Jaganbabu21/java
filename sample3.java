public class sample3 
{
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5};
        m1(arr);
    }
    static void m1(int[] arr)
    {
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            System.out.print(arr[i]+" ");
        
        }
    }
}
    

