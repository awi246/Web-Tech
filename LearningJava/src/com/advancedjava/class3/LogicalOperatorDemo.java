package com.advancedjava.class3;

import java.util.Scanner;

public class LogicalOperatorDemo {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Enter a sting");
		String a = scanner.nextLine();
		
		if(a.length()>=5 && a.length()<=15) {
			System.out.println("Pass");
		}
		
		else {
			System.out.println("Fail");
		}
	}
}
