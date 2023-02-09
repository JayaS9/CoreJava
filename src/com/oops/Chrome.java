package com.oops;
//Chrome (child) is extending abstract class Browser (parent), so it must have inherited abstract method
public class Chrome extends Browser {

	@Override
	public void OpenBrow() {
		// TODO Auto-generated method stub
		System.out.println("Opening Chrome");
		
	}

	@Override
	public void CloseBrow() {
		// TODO Auto-generated method stub
		System.out.println("Closing Chrome");
	}
	

}
