public class sample7
{
    public static void main(String[] args)
    {
        int[] arr={1, 2, 3, 4, 5};
        m1(arr);
    }
    static void m1(int[] arr)
    {
        int sum =0;
        for (int i=0; i<arr.length; i++)
        {
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    
}
    



    



