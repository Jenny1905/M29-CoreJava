//program to demonstrate on functional interface
package org.tnsif.interfacedemo;
//implementable class
public class ReceipeImplementable implements Receipe{
	private String name;
	
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String displayName() {
		return "Welcome to "+name;
	}

}
