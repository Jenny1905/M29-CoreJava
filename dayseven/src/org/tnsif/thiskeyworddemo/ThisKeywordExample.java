//program to demonstrate on this keyword
package org.tnsif.thiskeyworddemo;
public class ThisKeywordExample {
	
	//private data members
	private int cvvNo;
	private long atmNo;
	
	//parameterized constructor
	public ThisKeywordExample(int cvvNo, long atmNo) {
		/*It can be used to return the current 
		class instance*/
		
		this.cvvNo = cvvNo;
		this.atmNo = atmNo;
	}
	//user-defined method
	public void print()
	{
		System.out.println("CVV no.is: "+cvvNo+" "
				+"ATM Card No.is: "+atmNo);
	}
	
	
	

}
