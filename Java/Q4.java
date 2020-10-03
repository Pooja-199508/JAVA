    

  import java.util.*;
/*Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable.
[Note: primitive down casting is required in this program ] .*/
   public class Q4{
        public static void main( String args[]){

   Scanner sc = new Scanner(System.in);

  byte b1 = sc.nextByte();
  byte b2 = sc.nextByte();

 byte b3 = (byte)(b1 + b2);
     System.out.println(b3);
}
}