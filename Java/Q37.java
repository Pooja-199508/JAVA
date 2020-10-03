/*Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) 
that demonstrates the functionalities of Person class by creating Person object and calling methods.
 */
import java.util.Scanner;
class Studentdemo{
   private int Rollno;
   private String name;
   private int age;
   
   Studentdemo(){
    this.age = 18;
   }

   void setData(int Rollno, String name){
   this.Rollno=Rollno;
   this.name=name;
   }

   void ShowData(){
      System.out.println("Roll number is "+Rollno);
      System.out.println("name is "+name);
      System.out.println("age is "+age);

   }
}
class Q37
{
  public static void main(String args[])
  {
  
    Studentdemo s = new Studentdemo();
    s.setData(1, "mrudula");
    s.ShowData();
   }
}