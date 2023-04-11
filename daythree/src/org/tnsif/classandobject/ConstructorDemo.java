//program to demonstrate on class, Object and Constructor
//driver class
package org.tnsif.classandobject;
import java.util.Scanner;
public class ConstructorDemo {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id;
		String city,name;
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		//to read the nextLine
		s.nextLine();
		System.out.println("Enter the Customer Name: ");
		name=s.nextLine();
		System.out.println("Enter the Customer City: ");
		city=s.nextLine();
		
		//object creation
		//default constructor invoked
		Customer c=new Customer();
		c.setCustomerId(id);
		c.setCustomerName(name);
		c.setCity(city);
		//below statement will call to toString method
		System.out.println(c);
		
		
		System.out.println("Enter the Customer ID: ");
		id=s.nextInt();
		//to read the nextLine
		s.nextLine();
		System.out.println("Enter the Customer Name: ");
		name=s.nextLine();
		System.out.println("Enter the Customer City: ");
		city=s.nextLine();
		//parameterized constructor is invoked
		Customer c1=new Customer(id,name,city);
		System.out.println(c1);
		

	}

}
