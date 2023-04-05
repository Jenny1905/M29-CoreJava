//program to demonstrate on Arithmatic Operator
//(+,-,*,/,%)
package org.tnsif.operatordemo;
import java.util.Scanner;

public class ArithmaticOperatorProgram {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of x and y: ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		System.out.println("The addition of two numbers: "
				+(x+y));
		System.out.println("The subtraction of two numbers: "
				+(x-y));
		System.out.println("The multiplication of two numbers: "
				+(x*y));
		System.out.println("The Division of two numbers: "
				+(x/y));
		System.out.println("The Modulo of two numbers: "
				+(x%y));
	}

}
