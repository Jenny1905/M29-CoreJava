//Driver class
/*program to demonstrate on packages,access specifier and 
 * instanceof operator
 */
package org.tnsif.firstpackage;
public class AccessSpecifierExecutor {

	public static void main(String[] args) {
		Base b=new Base();
		
		b.methodDefault();
		b.methodPublic();
		b.methodProtected();
		/*Private members, we can't access into another class*/
		//b.varPrivate;
		//b.methodPrivate();
		
		//instanceof operator
		System.out.println(b instanceof Base);
	
	}

}
