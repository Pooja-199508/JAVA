//Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.
class Q30
{
  public static void main(String args[])
  {
      int[] a = {1,2,5};
      int[] b=  {4,5,6};
      int[] c=  {7,5,9};
    

      int[][] arr = new int[3][3];
       arr[0]= a;
       arr[1]= b;
       arr[2]= c;
     
  int sum =0;
      for( int i=0; i<arr.length; i++){
    
          for(int j=arr.length-1-i ; ;  ){
           
            sum += arr[i][j];
            break;
          }
        
      }
      System.out.println(sum);
  }
}