package com.advancedjava.class18;

public class ArithmeticOperation {
	
	public static int add(int a, int b) {
			return a+b;
	}

	
	public static int subtract( int a, int b) {
			return a-b;
	}
	
	public static int mul(int a, int b) {
			return a*b;
	}
	
	public static int compare (int a , int b) {
			return a>b?a:b;
	}
	
	public static void main(String[] args) {
			System.out.println("Addition:"+add(5,10));
			System.out.println("Subtraction:"+subtract(5,10));
			System.out.println("Multiply:"+mul(5,10));
			System.out.println("Greater Value:"+compare(5,10));
	}
}
