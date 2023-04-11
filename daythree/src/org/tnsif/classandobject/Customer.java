//Program to demonstrate on class,Object and Constructor
package org.tnsif.classandobject;
public class Customer {
	
	//private data members
	private int customerId;
	private String customerName;
	private String city;
	
	//constructor does not have any return type
	//it is same as classname followed by '()'
	
	//default constructor
	public Customer() {
		super();
		
	}
	
	//parameterized constructor
	public Customer(int customerId, String customerName, String city) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.city = city;
	}


	/*to access all the private data members into another class
	 * then use getters and setters*/
	//setters and getters method
	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	//object of a class will call to toString() method
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", city=" + city + "]";
	}
	
	

}
