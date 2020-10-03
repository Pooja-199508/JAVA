/* Q. Write a program to find the smallest and the largest number in an array ?
Array 1: [12, 34, 45,65, 76]
Min: 12
Max: 76 */
import java.util.Scanner;
class Q27
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
  
   
    int arr1[]=new int[4];
  

   System.out.println("Enter elements in array: ");
    for(int i=0;i<arr1.length;i++)
   {
      arr1[i]=sc.nextInt();
  }
  int small= arr1[0];
  int large= arr1[0];
  for(int i=1;i<arr1.length;i++)
  {
    if(arr1[i] > large){
        large=arr1[i];
    }
    if(arr1[i]<small){
        small=arr1[i];
    }
 }
 System.out.println("the smallest number is "+small);
 System.out.println("the largest number is "+large);
   }
}
