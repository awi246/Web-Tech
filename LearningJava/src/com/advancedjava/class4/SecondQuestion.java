package com.advancedjava.class4;

import java.util.Scanner;

public class SecondQuestion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		int a =  input.nextInt();
		
		if(a>0) {
			System.out.println("It is a positive number");
		}
		else if( a<0) {
			System.out.println("It is a negative number");
		}
		else {
			System.out.println("The number is 0");
		}
	}
}
