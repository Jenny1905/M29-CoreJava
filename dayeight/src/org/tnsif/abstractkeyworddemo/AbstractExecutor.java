//driver class
package org.tnsif.abstractkeyworddemo;
public class AbstractExecutor {

	public static void main(String[] args) {
		/*if any class contains abstract method,
		 * we can't instatiate that class
		 */
		//Remote r=new Remote();
		Remote r1=new RemoteChild();
		r1.cellName="Sigplex";
		r1.display();
		r1.functionRemote();
		r1.create();
		RemoteChild r=new RemoteChild();
		r.cellName="DuroCell";
		r.display();
		r.functionRemote();
		r.create();

	}
}
