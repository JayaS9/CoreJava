package com.oops;
//Abstraction (0 to 100%) : class will have abstract keyword.
//				Can have some abstract method but there extended class should contain inherited abstract methods.
//   			Interface (100%) have all abstract methods, even keyword mentioned or not.
// No instance of abstract class, i.e. browser Br = new Browser. But child class of abstract can have objects.
public abstract class Browser {
	
	public abstract void OpenBrow();
	
	public abstract void CloseBrow();

}
