package com.advancedjava.class2;

import java.util.Scanner;

public class PrivateDemo {

			private int showvalue(String value) {
				
					int length = value.length();
					return length;
			}
			public static void main(String[] args) {
				
				
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the string : ");
				String a = scanner.nextLine();
				
				
				PrivateDemo test = new PrivateDemo();
				int result = test.showvalue(a);
				System.out.println("Length of the String is:"+result);
					
			}
}
