class sample18
{
    static void printRange(int[] abb)
     {
        int sum=0;
        for (int i=0; i<abb.length; i++)
        {
            if( abb[i]>10 && abb[i]<=99 )
            {
                sum=sum+i;
            }
        } 
         System.out.println(sum);
     }
     public static void main(String[] args)
     {
        int[] arr={11, 2, 53, 4, 24};
        printRange(arr);
     }

}
