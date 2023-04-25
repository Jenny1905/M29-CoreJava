/*program to demonstrate on static block and static method*/
package org.tnsif.statickeyworddemo;
public class Customer {
	
	//non-static data member
	private int custId;
	//static data member
	private static String companyName;
	
	//static-block
	/*static block is used to initialize static
	 * variable only*/
	static
	{
		/*we cannot use non-static variable inside 
		 * the static 
			block*/
		//name="Abhinav";
		companyName="Myntra";
	}

	public Customer() {
		System.out.println("Default constructor");
		custId++;
		
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + "]";
	}

	//static method
	static void display()
	{
		//we can't use non-static variable in static method
		System.out.println(" Companyname: "
					+companyName);
	}
	

	
	
	
	
}
