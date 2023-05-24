//program to demonstrate on Multiple catch block
package org.tnsif.exceptiondemo;
public class MultipleCatchDemo {

	public static void main(String[] args) {
		int arr[]=new int[] {101,33,78};
		System.out.println("Array is: ");
		try {
			System.out.println(arr[3]);
		}
		/*we can use multiple catch block */
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception handled "+e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception handled "+e);
		}*/
		
		//we can pass multiple exception name inside the same catch block
		catch(ArrayIndexOutOfBoundsException | ArithmeticException e)
		{
			System.out.println(e);
		}

	}

}
