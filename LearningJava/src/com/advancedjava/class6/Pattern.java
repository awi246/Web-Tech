package com.advancedjava.class6;

import java.util.Scanner;

public class Pattern {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
//		System.out.println("Enter no. of rows:");
//		int a =  input.nextInt();
//		System.out.println("Enter no. of columns:");
//		int b =  input.nextInt();
		
		for(int row=0; row<5; row++) {
			for (int column=5; column>row;column--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}


//Question : Fibonacii series using for loop upto n term