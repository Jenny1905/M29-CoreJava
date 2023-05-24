//program to demonstrate on custom exception
package org.tnsif.customexception;
import java.util.Scanner;
public class CustomExceptionExample {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String id=s.nextLine();
		String password=s.nextLine();
		try {
			if(id.equals("kumbhalkarshiwani@gmail.com")&&
				password.equals("pass@123"))
			{
				System.out.println("Credentials matched");
			}
			else
			{
				throw new LoginCredential("Invalid Credentials");
			}
		}
		//handling using UD exceptions
		catch(LoginCredential e)
		{
			System.out.println("Exception handled "+e);
		}
		
		}

}
		
		
		
		
		
		
	
