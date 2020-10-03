/*Find the result of following expressions. You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Q3{
        public static void main(String args[]){
     int x = 10;
     double y= Math.pow(x,2) + 3*x - 7;
     System.out.println(y);

     double y1 = x++ + ++x ;
    System.out.println(y1 +"," +x);

     double z = x++ - --y1 - --x  +  x++; 
       System.out.println(z +","+y+","+x);

    boolean a = true;
    boolean b = false;
    boolean z1 = a && b || !(a || b);
      System.out.println(z1);
}
}	