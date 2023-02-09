package com.test;
import java.util.Scanner;

public class kmtomiles {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Lets convert KM to miles, tell me the KMs: ");
		double km = userinput.nextInt();
		double mile = 0.621 * km;
		System.out.println("It means "+mile+" miles.");
	}

}
