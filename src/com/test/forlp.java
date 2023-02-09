package com.test;
import java.util.Scanner;

public class forlp {
	public static void main(String[] args) {
		System.out.println("Enter the loop iterations you want: ");
		Scanner inp = new Scanner(System.in);
		int a = inp.nextInt();
		for(int i=0;i<a;i++) {
			System.out.println("Iteration "+i);
		}
		System.out.println("Loop ends here.. Now again enter the number");
		int b = inp.nextInt();
		for(int i=b; i>=0; i--) {
			System.out.println("Rev iteration: "+i);
		}
		System.out.println("Reverse loop ends here..");
	}

}
