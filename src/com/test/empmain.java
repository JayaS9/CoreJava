package com.test;

public class empmain {
	
	public static void main(String[] args) {
		//Emply is the class we created, creating object E1 in class Emply	
		//Name, ID, Salary are the attributes/properties of class
		Emply E1 = new Emply ();
		E1.Name = "Sarovar";
		E1.ID = 359;
		E1.Salary = 40000;
		//here we can't simply sysout (Name) because it is not a variable, it is an attribute of class.
		//So call the class instance/object name and then its attribute E1.Name, then it will give value.
		System.out.println(E1.Name);
		System.out.println(E1.ID);
		System.out.println(E1.Salary);
		
		//Creating E2 object by new keyword, calls constructors (normal one and parameterized one)
		//values are passed to parameter then to attribute
		Emply E2 = new Emply("Dari", 134, 7500);
		//Calling Disply function here from Emply.java class, to avoid repetative sysouts.
		E2.Disply();
		
		Emply E3 = new Emply("Jane", 678, 8900);
		E3.Disply();
		
		Emply E4 = new Emply("Ruth", 945, 23500);
		E4.Disply();
	}

}
