//program to demonstrate on final method
//child class
package org.tnsif.finalkeyword;
public class FinalMethodChildClass extends FinalMethod{
	
		 public int num=275;
		//method overloading
		final void show(int num)
		{
			System.out.println("The num is: "+num);
		}
		//final method
		/*final method can't be overide, we will get compile
		time error*/
		/*
		 *
		 //method overide
		final void show()
		{
			System.out.println("Salary is: "+salary);
		}*/

}
