//program to demonstrate on functional interface
/*Functional Interface: An interface which contains
 * exactly one abstract method*/
package org.tnsif.interfacedemo;

/*Below annotation tell us that interface must have one
abstract method*/
@FunctionalInterface
public interface Receipe {
	/*by default all the methods inside an
	 * interface are public abstract and variable are
	 * public static final*/
	
	//abstract method
	String displayName();
	//String print();

	

}
