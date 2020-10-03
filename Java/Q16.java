//Write a program to print table of any entered number using loop
import java.util.Scanner;
class Q16
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   int num=sc.nextInt();
   System.out.println("Table of "+num+" is: ");
   for(int i=1;i<=10;i++)
   {
      System.out.println(+num+"*"+i+" ="+num*i);
   }
 }
}