package org.tnsif.secondpackage;
//way to import the another package
//import org.tnsif.firstpackage.*;
import org.tnsif.firstpackage.Base;
public class Executor {
	public static void main(String[] args) {
		Base b1=new Base();
		/*if any method is default we cannot access into 
		 * another package, we can access only inside the same
		 * package
		 */
		
		//b1.methodDefault();
		b1.methodPublic();
		
		

	}

}
