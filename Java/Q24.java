//Write a program to search an element in the array.
import java.util.Scanner;
class Q24
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
   
 System.out.print("Enter number to check wherther it is present or not if present then return number with index ");
int num1=sc.nextInt();
  for(int i=0;i<arr.length;i++)
   {
      if(arr[i]==num1)
     {
          System.out.println(+num1+" Element found at index "+i);
         break;
    }
    
  }

   }
}