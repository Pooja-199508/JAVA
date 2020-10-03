/*Create a class OneBHK with instance variables roomArea, hallArea and price. 
Then create default constructor that initializes instance variables with some values and 
a parameterized constructor that takes values for all instance variables and stores them in instance variables. 
Now create a method named show()  to print OneBHK’s instance variable values.
Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. 
Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of all instance variables. 
Override show() method to print all data member information.
Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. Also print total amount of all flats. 
 */

import java.util.Scanner;
class OneBHK{
	double roomArea;
	double hallArea;
	double price;

	OneBHK(double roomArea,double hallArea,double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	void show(){
		System.out.println("Room Area 1: "+roomArea+" Hall 	Area:"+hallArea+" Price:"+price);
	}
}

class TwoBHK extends OneBHK{
	double roomArea2;
	TwoBHK(double roomArea,double hallArea,double price,double roomArea2){
                                          super(roomArea, hallArea, price);
		this.roomArea2=roomArea2;
		
	}

	void show(){
		super.show();
		System.out.println("Room Area 2: "+roomArea2);
	}
}

class Q43{
public static void main(String args[]){
 	Scanner sc=new Scanner(System.in);
	double total = 0.00;
	TwoBHK []tb=new TwoBHK[3];
	for(int i=0;i<tb.length;i++){
		System.out.println("Enter Room1 area:  ");
		double ra1=sc.nextDouble();
		System.out.println("Enter Hall area:  ");
		double ha=sc.nextDouble();
		System.out.println("Enter Price:  ");
		double price=sc.nextDouble();
		 total += price;
		System.out.println("Enter Room2 area:  ");	
		double ra2=sc.nextDouble();
		
                                          TwoBHK tb1=new TwoBHK(ra1,ha,price,ra2);
		tb[i]=tb1;
                                           
	}
	for(TwoBHK a: tb){
		a.show();
	}
	System.out.println("Total Prize of the flats: "+total);
}}