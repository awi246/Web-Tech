package com.advancedjava.class2;

import java.util.Scanner;

public class PublicDemo {
	
	 public int additon(int a, int b) {
		
		 return a+b;
	 }
	public static void main(String[] args) {
				
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int num1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			int num2 = scanner.nextInt();
		
			PublicDemo test = new PublicDemo();
			int result = test.additon( num1, num2);
			
			System.out.println("Sum is :" + result);
	}

}
