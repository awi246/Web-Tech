package com.advancedjava.class4;

import java.util.Scanner;

public class FourthQuestion {
	 
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a Single Character ");
		char a =s.next().charAt(0);
		
		if(a>=97 && a<=122) {
			System.out.println("It is in lowercase");
		}
		
		else if(a>=65 && a<=90 ) {
			System.out.println("It is in uppercase");
		}
		else {
			System.out.println("Please enter a valid character");
		}
	}
}
