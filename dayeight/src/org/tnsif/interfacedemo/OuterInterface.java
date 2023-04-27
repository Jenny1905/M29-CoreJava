//program to demonstrate on Nested Interface
/*Nested Interface: Inside an interface, there will be an 
 * another interface*/
package org.tnsif.interfacedemo;
public interface OuterInterface {
	
	int sum();
	interface InnerInterface{
		String concatenate();
	}

}
