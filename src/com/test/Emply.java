package com.test;

public class Emply {
	//this is a class Emply.java which will be called in main method of empmain.java
	//public access modifier which can be accessed by other classes.
	//Private access modifier means can be used by that class only.
	//Function returns the value, method doesn't return.
	//Object has attribute and function has variables
	public String Name;
	public int ID;
	public int Salary;
	
	//Constructor is a special method which doesn't return anything but used to initialize the attributes of objects.
	//Constructor has same name as in existing class's name.
	//Constructor is called when "new" keyword is hit while creating object, or creates/calls default constructor.
	public Emply() {
		System.out.println("Constructor initiated, new object is created");
	}
	
	//Parameterized constructor - Assign value to attributes in the same line of creating object
	//public Constructor/ClassName (DataType Parameter1, DataType Parameter2){
	//		Attribute1 = Parameter1; Attribute2 = Parameter2;}
	//Class>>Object>>Attribute>>Parameter>>Value
	//Emply>>E2>>Name>>P1>>"Dari"
	//Values are passed while creating object itself in main method.
	
	public Emply(String P1, int P2, int P3) {
		Name = P1;
		//Adding this.ID in parameters refers to current class only.
		ID=P2;
		Salary=P3;
	}
	
	//Display is the function we've created which will be called in main method empmain.java
	//sysout can have directly Name, ID instead of E1.Name, as it is generic function and not specific to object like E1
	// public void MethodName(){
	//    common instructions including the attributes of class used by various objects};
	// void in method indicated no "return" value. int in method needs "return 1000;" in the { } of method.
	
	public void Disply() {
		System.out.println(Name);
		System.out.println(ID);
		System.out.println(Salary);
	}

}
