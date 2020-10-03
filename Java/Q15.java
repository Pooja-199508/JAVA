//Program to find greatest in 3 numbers. [ once using if else statement and then using ternary operator ( logical operator) ]  
 
import java.util.*;
public class Q15{   
public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender and age: ");
		char sex = sc.next().charAt(0);
                //char s = sex.charAt(0);
		int age = sc.nextInt();
		if((sex=='F' && age>=18) || (sex=='M' && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Not Eligible for marriage");
		}
	}
}