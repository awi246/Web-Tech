package com.advancedjava.class4;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number ");
		int a =  input.nextInt();
		
		if(a<100) {
			if(a%2==0) {
				System.out.println("Even");
			}
			else {
				System.out.println("Odd");
			}
		}
		else {
			System.out.println("Entered number is greater than 100");
		}
	}
}
