package org.tnsif.encapsulation;
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		//object creation
		HDFCBank h=new HDFCBank();
		//setters is used to set a value
		h.setCardNo(23456789234L);
		h.setCardType("Debit-Card");
		h.setCvvNo(444);
		h.setPinNo(1001);
		//getters is uded to return a value
		System.out.println(h.getCardNo());
		System.out.println(h.getCardType());
		System.out.println(h.getCvvNo());
		System.out.println(h.getPinNo());

	}

}
