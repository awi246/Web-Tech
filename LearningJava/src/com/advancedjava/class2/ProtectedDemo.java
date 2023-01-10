package com.advancedjava.class2;

public class ProtectedDemo {
			private int result;
			
		protected void add(int num1 , int num2) {
				 result = num1 + num2;
				System.out.println("Sum is :"+ result);
		}
		
		protected void sub(int num1 , int num2) {
			  	result = num1 - num2;
			System.out.println("Difference is :"+ result);
	}
		
		protected void mul(int num1 , int num2) {
			 	result = num1 * num2;
			System.out.println("Multiplication is :"+ result);
	}
		protected void div(int num1 , int num2) {
		 		result = num1 / num2;
		System.out.println("Division is :"+ result);
}
		
			
		
}
