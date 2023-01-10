package com.advancedjava.class6;

import java.util.Scanner;

public class SumOfNaturalNumber {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number:");
		int a =  input.nextInt();
		int sum=0;
		
		for(int i=0;i<=a;i++) {
			sum = sum +i;
			
			
				
		}
		System.out.println(sum);
	}
}
