public class sample9 {
    public static void main(String[] args)
    {
      int[] arr= {1, 2, 3, 4, 5};
       m1 (arr);                      //square of each and sum
    }
    static void m1(int[] arr)
    {
        int sum=0;
        for(int i=arr.length-1; i>=0;i--)
      {
        sum= sum+(arr[i]*arr[i]);
      }  
      System.out.println(sum);
    }


}
