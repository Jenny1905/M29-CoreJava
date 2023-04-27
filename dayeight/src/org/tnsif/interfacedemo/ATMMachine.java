//program to demonstrate on interface
package org.tnsif.interfacedemo;
public interface ATMMachine {
	/*all the variables inside an interface are by default
	 * public static final,
	 * so, here amount is final type and it must be
	 * initialize*/
	//int amount;
	int amountWithdraw=1250;
	int amountDeposit=2000;
	/*by default all the methods inside an interface
	 * are public abstract*/
	void withdraw();
	void deposit();
}
