package com.advancedjava.class5;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		int i=1;
		int sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Which multiplication table you want to generate: ");
		int a =  input.nextInt();
		
		do {
			int result = a*i ;
			System.out.println(""+a+"*"+i+"="+result);
			i++;
			
		}while(i<=10);
			
	}
}
