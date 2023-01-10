package com.advancedjava.class4;

import java.util.Scanner;

public class ThirdQuestion {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number ");
		int a =  input.nextInt();
		
		if(a>0) {
			System.out.println(a);
		}
		else if( a<0) {
			System.out.println(a*-1);
		}
		else {
			System.out.println("The number is 0");
		}
	}
}
