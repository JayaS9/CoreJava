package com.test;
import java.util.Scanner;

public class switchcs {
	public static void main(String[] args) {
		System.out.println("Enter your fav number from 1 to 5 : ");
		Scanner inp = new Scanner (System.in);
		int num = inp.nextInt();
		switch(num) {
		case 1 -> System.out.println("You're lucky!");
		case 2 -> System.out.println("You're bad!");
		case 3 -> System.out.println("You're mad!");
		case 4 -> System.out.println("You're sad!");
		case 5 -> System.out.println("You're happy!");
		}
		System.out.println("Thanks..");
	}

}
