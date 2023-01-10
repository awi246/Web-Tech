package com.advancedjava.class13;

import java.util.Scanner;

public class Calculator {
		
		int num1, num2;
		Scanner scanner = new Scanner(System.in);
		
		
		public int addition() {		
		
			return num1+num2;
		}
		
		public Calculator(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
			
		}
}
