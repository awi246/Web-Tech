package com.advancedjava.class3;

import java.util.Scanner;

public class Compare3Numbers {
		
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Enter the first nunmber");
			int a = s.nextInt();
			
			
			System.out.println("Enter the first nunmber");
			int b = s.nextInt();
			
			
			System.out.println("Enter the first nunmber");
			int c = s.nextInt();
			
			int greatest = (a >b) ? (a>c? a:c) : (b>c?b:c);
			
			
			
			
			System.out.println("The largest number is "+ greatest);
			
	}
}
