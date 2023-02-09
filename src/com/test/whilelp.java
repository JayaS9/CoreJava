package com.test;

public class whilelp {
	public static void main(String[] args) {
		int a=10;
		while(a<15) {
			System.out.println(a);
			a++;
		}
		System.out.println("Ends while loop and starts do while loop");
		do {
			a--;
			System.out.println(a);
		}while(a>11);
	}

}
