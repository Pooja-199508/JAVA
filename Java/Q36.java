/*Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 
*/
import java.util.*;
class Mathopr{
 int o(int n1, int n2){
     return n1 * n2;
 }
 
  float o( float n1, float n2, float n3){
    return n1 * n2 * n3;
  }
 
   double o(double n1, int n2){
     return n1 * n2;
   }

}

class Q36
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
  
  
   Mathopr s =new Mathopr();
   System.out.println(s.o(1,5));
   System.out.println(s.o(1.5f, 5.2f, 4.5f));
   System.out.println(s.o(1.25, 5));
   }
}