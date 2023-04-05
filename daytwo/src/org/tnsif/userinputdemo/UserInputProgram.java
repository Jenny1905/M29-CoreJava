//program to demonstrate on user-input value
package org.tnsif.userinputdemo;
import java.util.Scanner;

public class UserInputProgram {

	public static void main(String[] args) {
		//user-input
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your salary: ");
		float salary=s.nextFloat();
		
		//double salary1=s.nextDouble();
		System.out.println("Enter your name: ");
		//next() is used to get first word of your sentence
		String name=s.next();
		
		s.nextLine();
		
		System.out.println("Enter your name1: ");
		//nextLine() is used to get entire sentence of your string
		String name1=s.nextLine();
		
		System.out.println("Enter the charcater: ");
		char ch=s.next().charAt(1);
		
		System.out.println("Salary is: "+salary);
		System.out.println("Name is: "+name);
		System.out.println("Name1 is: "+name1);
		System.out.println("Character is: "+ch);

		s.close();

	}

}
