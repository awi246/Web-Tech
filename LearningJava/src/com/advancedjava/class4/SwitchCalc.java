package com.advancedjava.class4;

import java.util.Scanner;

public class SwitchCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a =  input.nextInt();
		System.out.println("Enter second number ");
		int b =  input.nextInt();
		System.out.println("Enter the required Operation ");
		char c =  input.next().charAt(0);
		
		switch(c) {
		
		case '+':
			System.out.println(a+b);
			break;
		
		
		case '-':
			System.out.println(a-b);
			break;
			
		case '*':
			System.out.println(a*b);
			break;
		case '/':
			System.out.println(a/b);
			break;
		
			default:
				System.out.println("Enter valid number");
		}
	}

}
