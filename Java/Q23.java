//Write a program to reverse the array elements.
import java.util.Scanner;
class Q23
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter N number: ");
    int num=sc.nextInt();
    int arr[]=new int[num];
   int temp=0;
   System.out.println("Enter elements in array: ");
    for(int i=0;i<arr.length;i++)
   {
      arr[i]=sc.nextInt();
  }
   
 System.out.print("Enter elements of an array in reverse order: ");
  for(int i=arr.length-1;i>=0;i--)
   {
      System.out.print(arr[i]+" ");
  }

   }
}