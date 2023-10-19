class sample17
{
    static void printRange(int[] abb)
     {
        int sum=0;
        for (int i=0; i<abb.length; i++)
        {
            if( abb[i]>0 && abb[i]<=9 )
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