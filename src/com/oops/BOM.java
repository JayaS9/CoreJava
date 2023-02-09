package com.oops;

// Inheritence - child class extends parent class
public class BOM extends bank {
	public int CreditNm;
	public int RollNo = 33;
	public void DisRoll() {
		// "this" calls variable of current class
		//"super" calls variable of immediate parent class and not of grandparent
		System.out.println(this.RollNo);
		System.out.println(super.RollNo);
	}

}
