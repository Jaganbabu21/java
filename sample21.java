class sample21
 {
    static int findFact(int no)
    {
        int fact = 1;
        for(int i=no; i>=1; i--)
        {
            fact = fact*i;
        }
        return fact;
    }
    static void findsumofarr(int[] arr)
    {
        int sum= 0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>3 && arr[i]<5 && arr[i]%2==0)
            sum=sum+findFact(arr[i]);
        }
        System.out.println(sum);
    }
    public static void main(String[] args)
    {
        int[] arr ={1, 2, 3, 4, 5};
        findsumofarr(arr);
    }
 }
    


