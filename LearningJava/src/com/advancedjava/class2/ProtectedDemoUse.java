package com.advancedjava.class2;

import java.util.Scanner;

public class ProtectedDemoUse extends ProtectedDemo{
	
		public static void main(String[] args) {
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter first number : ");
			int num1 = scanner.nextInt();
			System.out.println("Enter second number : ");
			int num2 = scanner.nextInt();
			
			
			ProtectedDemoUse test = new ProtectedDemoUse();
			test.add(num1, num2);
			test.sub(num1, num2);
			test.div(num1, num2);
			test.mul(num1, num2);
		}
}
