//Write a program to reverse a given number.
import java.util.Scanner;
class rev_num
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number ");
   int num=sc.nextInt();
   int rem=0;
   int rev=0;
    while(num>0)
   {
     rem=num%10;
     rev=rev*10+rem;
    num=num/10;
  }
  System.out.println("The reverse number is:  "+rev);
 }
}