public class sample24
{
    static int findfact(int no)
    {
        int fact =1;
        for(int i=no; i>=1; i--)
        {
            fact=fact*i;
        }
          return fact;
    }
    static void findsumofeven(int[] arr)
    {
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>0 && arr[i]<=9 )
            sum= sum+findfact(arr[i]);
            
        
    }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int[] arr ={12, 12, 3, 4, 5, 8, 1};
        findsumofeven(arr);

    }
    
}


