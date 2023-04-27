package org.tnsif.interfacedemo;
//implementable class
public class ATMMachineChild implements ATMMachine{

	@Override
	public void withdraw() {
		System.out.println("Withdraw amount: "+amountWithdraw);
		
	}
	@Override
	public void deposit() {
		System.out.println("deposited amount: "+amountDeposit);
	}

}
