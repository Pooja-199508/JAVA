/*Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees and total of their salaries.
 */

import java.util.Scanner;
class Employee{
	private static int count=0;
	private static int empNo;
	private double salary;
	private static double totalsalary;
	
	Employee()
	{

	}
	Employee(double salary){
		this.empNo=++count;
		this.salary=salary;
		this.totalsalary+=salary;
	}

	void totalsalary()
	{
                        	System.out.println("Total salary Of the employeeis: "+totalsalary);
	}	

	void totalemployees()
	{
		System.out.println("Total Employess : "+empNo);
	}
	}

class Q38
{
   public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
  for(int i=0;i<=3;i++)
{
    System.out.println("Enter Salary of employees ");
   double salary=sc.nextDouble();
  Employee e1=new Employee(salary);
  } 
  Employee e2=new Employee();
  e2.totalsalary();
  e2.totalemployees();
}
}