package com.test;
import java.util.Scanner;

public class operator {
	public static void main(String[] args) {
		System.out.println("Operator result: " + (36<74 && 24<96));
		// follows precedence and associativity, not BODMAS
		int a = 3;
		int b = a++;
		int c = ++a;
		int d = c;
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		char f = 'f';
		char k = ++f;
		System.out.println(k);
		
		System.out.println("Enter the comaprison number: ");
		Scanner num = new Scanner(System.in);
		int number = num.nextInt();
		System.out.println(number >8);
		
		char grade = 'B';
		grade = (char) (grade +8);
		System.out.println(grade);
		grade = (char) (grade -8);
		System.out.println(grade);
	}

}
