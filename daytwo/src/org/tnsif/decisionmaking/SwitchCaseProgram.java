//program to demonstrate on switch case
package org.tnsif.decisionmaking;
import java.util.Scanner;

public class SwitchCaseProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the song input");
		int songInput=s.nextInt();
		//switch case statement
		switch(songInput)
		{
			case 1:
				System.out.println("calm down");
				//break;
			case 2:
				System.out.println("perfect");
				break;
			case 3:
				System.out.println("Mallem song");
				break;
			default:
				System.out.println("Invalid input");
		}

	}

}
