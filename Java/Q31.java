/*Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.*/
import java.util.Scanner;
class Studentdemo{
   private int Rollno;
   private String name;
   

   void setData(int Rollno, String name){
   this.Rollno=Rollno;
   this.name=name;
   }

   void ShowData(){
      System.out.println("Roll number is "+Rollno);
      System.out.println("name is "+name);

   }
}
class Q31
{
  public static void main(String args[])
  {
  
    Studentdemo s = new Studentdemo();
    s.setData(1, "mrudula");
    s.ShowData();
   
 
 
   }
}