package com.advancedjava.class4;

import java.util.Scanner;

public class IfStatementSecond {
	
	public static void main(String[] args) {
			Scanner dimension = new Scanner(System.in);
			System.out.println("Enter length: ");
			int a =  dimension.nextInt();
		
			System.out.println("Enter breadth: ");
			int b =  dimension.nextInt();
			
			if(a ==b ) {
				System.out.println("It is a square");
			}
			else {
				System.out.println("It is not a square");
			}
	}

}
