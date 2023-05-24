//program to demonstrate on Arithmetic Exception
package org.tnsif.exceptiondemo;
import java.util.Scanner;
public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value for x and Y:");
		int x=s.nextInt();
		int y=s.nextInt();
		//try block contains an exception code
		try {
			System.out.println(x/y);
		}
		//catch block handles an exception
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
		}
		finally
		{
			System.out.println("Finally block is always excuted");
		}
		
	}

}
