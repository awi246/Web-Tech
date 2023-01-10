package com.advancedjava.class3;

import java.util.Scanner;

public class CompareThreeNumbers {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first nunmber");
		int a = s.nextInt();
		
		
		System.out.println("Enter the first nunmber");
		int b = s.nextInt();
		
		
		System.out.println("Enter the first nunmber");
		int c = s.nextInt();
		
		if(a>b && a>c) {
			System.out.println("a is greater");
			
		}
		else if( b>c && b>a) {
			System.out.println("b is greater");
		}
		else
			System.out.println("c is greater");
		
	}
}
