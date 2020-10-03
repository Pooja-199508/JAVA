//Calculate  series : 12+22+32+42+.........+n2
import java.util.Scanner;
class sum_series
{
  public static void main(String args[])
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter number ");
   int num=sc.nextInt();
  int sum=12;
  int sum1=0;
  for(int i=1;i<=num;i++)
 {
    System.out.print(sum);
    if(i<num)
   {
     System.out.print("+");
   }
    sum1+=sum;
    sum=sum+10;
   }
  System.out.println("\n\nSum of the given series is: "+sum1);
   }
}