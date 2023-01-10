package com.advancedjava.class7;

import java.util.Scanner;

public class PracticeQuestion {
	public static void main(String[] args) {
		int sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do u want to add");
		int a =  input.nextInt();
		for(int i=0;i<a;i++) {
			Scanner number = new Scanner(System.in);
			System.out.println("Enter the number");
			int b =  number.nextInt();
				if(b<0) {
					break;
				}
				sum = sum+b;
		}
		System.out.println("The sum is:"+sum);
		
		
	}

}
