/*Create a class Student having data members name, roll no., age and score.
 Write a program to accept 10 records of student and store them in an array. 
 And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100]. */
import java.util.Scanner;
class Student{
	private String name;
	private int rollno;
	private int age;
	private int score;

	Student(String name,int age,int rollno,int score){
		this.name=name;
		this.rollno=rollno;
		this.age=age;
		this.score=score;
	}

	int getscore(){
		return score;
	}
	void display()
	{
		System.out.println("Name:"+name+" Age:"+age+" Roll No:"+rollno+" Score:"+score);
	}

}


class Q40{
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	Student s[]=new Student[3];
                     String name;
	int age,rollno,score;
	System.out.println("Enter Name, Age, Roll No, 	Score: ");
	for(int i=0;i<s.length;i++){
	name=sc.next();
	age=sc.nextInt();
	rollno=sc.nextInt();
	score=sc.nextInt();	
                  	s[i]=new Student(name,age,rollno,score);
	}
	for(Student a:s){
		a.display();
	}
	System.out.println("============================================");
                      System.out.println("Students Record Whose Score Between {0-50}");
	for(int i=0;i<s.length;i++){
		if(s[i].getscore() > 0 && s[i].getscore()<=50){
			s[i].display();
		}
	}
	System.out.println("============================================");
   	System.out.println("Students Record Whose Score Between {50-65}");
	for(int i=0;i<s.length;i++){
		if(s[i].getscore() > 50 && s[i].getscore()<=65){
			s[i].display();
		}
	}
	System.out.println("============================================");
	System.out.println("Students Record Whose Score Between {65-80}");
	for(int i=0;i<s.length;i++){
		if(s[i].getscore() > 65 && s[i].getscore()<=80){
			s[i].display();
		}
	}

	System.out.println("============================================");
                      System.out.println("Students Record Whose Score Between {80-100}");
	for(int i=0;i<s.length;i++){
		if(s[i].getscore() > 80 && s[i].getscore()<=100){
			s[i].display();
		}
	}
	
}}