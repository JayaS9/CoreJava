package com.test;
import java.util.Scanner;

public class intornot {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Give me any number, I will tell you if it is an integer or not: ");
		System.out.println(inp.hasNextInt());
		System.out.println(inp.hasNextFloat());
		boolean result = inp.hasNextInt();
		if (result==true) {
			System.out.println("Entered number is integer.");
		} else {
			System.out.println("Entered number is non-integer");
		}
	}
}
