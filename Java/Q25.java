//25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
import java.util.Scanner;
class Q25
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter N number: ");
    int num=sc.nextInt();
    int arr[]=new int[num];
    int even=0;
    int odd=0;
   System.out.println("Enter elements in array: ");
    for(int i=0;i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
  }
   
 
  for(int i=0;i<arr.length;i++)
   {
      if(arr[i]%2==0)
     {
        even+=arr[i];
    }
   else
   {
    odd+=arr[i];
   }
    
  }
  System.out.println("Sun of Even elements of an array is: "+even);
  System.out.println("Sun of Even elements of an array is: "+odd);

   }
}