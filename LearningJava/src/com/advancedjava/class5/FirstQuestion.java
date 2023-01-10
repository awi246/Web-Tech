package com.advancedjava.class5;

import java.util.Scanner;

public class FirstQuestion {
	public static void main(String[] args) {
		int i=2;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter nth term: ");
		int a =  input.nextInt();
		
			do {
				System.out.println(i);
				sum = sum + i;
				i=i+2;
				
			}while(i<=a);
				
			System.out.println("sum is: "+sum);
			
		}
	}

