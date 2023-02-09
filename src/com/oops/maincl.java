package com.oops;

import com.test.Emply;

public class maincl {
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
		
		bank B1 = new bank();
		B1.DisplayBal();
		System.out.println(B1.testretn());
		
		BOM B2 = new BOM();
		int CredNm = B2.CreditNm;
		//Child can call methods of parent, but not vice versa.
		B2.DisplayBal();
		
		B2.DisRoll();
		
		overloadingEx area = new overloadingEx();
		//Polymorphism - overloading - calling same name methods (can have different parameters) from same class, method overloading.
		//			   - overriding - should be inheritence - calling same name methods but should have same parameters and data type too.
		int squarearea = area.calArea(4);
		int rectarea = area.calArea(3, 5);
		System.out.println(squarearea);
		System.out.println(rectarea);
		
		//Initializes with child class, Chrome, as parent class is abstract class.
		//Doing this helps to use all methods of parent class,i.e. Browser.
		Chrome Ch = new Chrome();
		Ch.OpenBrow();
		
		//Browser is abstract class so can't create its instance (object), but can create from child.
		Browser Br = new Chrome ();
		Br.OpenBrow();
		Br.CloseBrow();
		
		
		hondaCar Hn = new hondaCar();
		Hn.start();
		
		carInterface Cr = new hondaCar();
		Cr.stop();
		
		//object of encapsulation class
		encapsulationEx En = new encapsulationEx();
		//.getgender .setgender is used to access private method of encapsulation.
		En.setGender('F');
		System.out.println(En.getGender());
	}


}
