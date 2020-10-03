//Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
class Q26
{
  public static void main(String args[])
  {
      int[] a = {1,2,5,6};
      int[] b= { 4,5,6,7};
      int[] c= {7,5,9,7};
      int[] d ={15,12};
      int[] e = {16,14,22};

      int[][] arr = new int[5][];
       arr[0]= a;
       arr[1]= b;
       arr[2]= c;
       arr[3]= d;
       arr[4]= e;
  int sum =0;
      for( int a1[] : arr){
    
          for(int a2 : a1 ){
            sum += a2;
              System.out.print(" "+a2+" ");
          }
          System.out.println("");
      }
      System.out.println(sum);
  }
}
