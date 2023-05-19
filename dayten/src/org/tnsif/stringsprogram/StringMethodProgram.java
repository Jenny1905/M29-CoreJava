//program to demonstrate on String methods
package org.tnsif.stringsprogram;
import java.util.Scanner;
public class StringMethodProgram {

	public static void main(String[] args) {
		//using string literal
		String str1="Dhoni";
		//using new string
		Scanner s=new Scanner(System.in);
		String str2=new String(s.nextLine());
		
		if(str1.equals(str2))
			System.out.println("Both are equal");
		else
			System.out.println("Not equal");

	}

}
