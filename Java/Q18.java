//Program to check whether number is prime or not.
import java.util.Scanner;
class prime_num
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number ");
   int num=sc.nextInt();
   int i=2;
   int count=0;
    while(i<=num)
   {
     if(num%i==0)
     {
        count++;
      }
      i++;
  }
 if(count==1)
  {
   System.out.println(num+"Is a Prime Number");
   }
 else
  {
    System.out.println(num+"Is  Not aPrime Number");
   }
  
 }
}