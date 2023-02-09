package com.test;
import java.util.Scanner;

public class stars {
	public static void main(String[] args) {
		System.out.println("Enter the highest number of stars: ");
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=a; i>0; i--) {
			for(int j=1; j<i;j++) {
				System.out.print("*");
			}
			System.out.println("*");
		}
		
	}

}
