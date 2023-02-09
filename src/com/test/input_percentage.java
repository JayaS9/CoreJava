package com.test;
import java.util.Scanner;


public class input_percentage {
	public static void main(String[] args) {
		Scanner userinput = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		String name = userinput.next();
		System.out.println("Hi "+name+" Let's calculate your percentage!");
		System.out.println("Enter your obtained marks in English: ");
		float eng =userinput.nextInt();
		System.out.println("Enter your obtained marks in Maths: ");
		float math =userinput.nextInt();
		System.out.println("Enter your obtained marks in Science: ");
		float sci =userinput.nextInt();
		System.out.println("Enter total marks of 3 subjects: ");
		float total = userinput.nextInt();
		float percentg=((eng+math+sci)/total)*100;
		System.out.println("Your percentage are: "+percentg);
	}

}
