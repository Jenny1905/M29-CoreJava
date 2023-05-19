//program to demonstrate on String Buffer
package org.tnsif.stringsprogram;
public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str1=new StringBuffer("Valay");
		//by default, capacity of any empty string is 16
		System.out.println(str1.capacity());//bydefault+length
		System.out.println(str1.charAt(2));
		
	}

}
