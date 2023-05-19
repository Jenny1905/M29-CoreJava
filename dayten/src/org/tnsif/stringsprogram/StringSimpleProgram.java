/*demonstrate a string program by using string literal and using
 *new keyword*/
package org.tnsif.stringsprogram;
public class StringSimpleProgram {

	public static void main(String[] args) {
		//using string literal
		String str1="Prathmesh";
		System.out.println("Using string literal: "+str1);
		
		//using new keyword
		String str2=new String("Prathmesh");
		System.out.println("Using new keyword: "+str2);
		
		//using string literal

		String str3="Prathmesh";
		
		/*when the string is created by using new keyword and 
		 * both the string are same it will create a memory for that
		 * string and hemce using == we will get it as different(false)*/
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str1==str3);


	}

}
