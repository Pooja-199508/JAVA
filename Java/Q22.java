//Sort a ten element array in ascending order.
import java.util.Scanner;
class Q22
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter N number: ");
    int num=sc.nextInt();
    int arr[]=new int[num];
   int temp=0;
   System.out.println("Enter elements in array: ");
    for(int i=0;i<num;i++)
   {
      arr[i]=sc.nextInt();
  }
   for(int i=0;i<num-1;i++)
   {
     for(int j=i+1;j<num;j++) 
     {
       if(arr[i] > arr[j])
        {
          temp=arr[i];
           arr[i]=arr[j]; 
          arr[j]=temp; 
        }
     }
  }
 System.out.print("Enter elements in Asending order: ");
  for(int i=0;i<num;i++)
   {
      System.out.print(arr[i]+" ");
  }

   }
}