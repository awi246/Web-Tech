package com.advancedjava.class13;

public class MathematicalOperations extends Calculator {
		
			private int num11;
			private int num22;
			
			private int result;
			
			public MathematicalOperations(int num1, int num2) {
				
					super(num1,num2);
			}
			
			public void getData() {
				System.out.println("Enter num1: ");
				num11 = scanner.nextInt();
				
				System.out.println("Enter num2: ");
				num22 = scanner.nextInt();
				
			}
			public int addition() {
				result = super.addition();
				return result;
			}
			
			public int subtraction() {
				int subtraction = result- num11-num22;
				return subtraction;
			}
		
			public static void main(String[] args) {
					
				MathematicalOperations calc = new MathematicalOperations(20,30);
				calc.getData();
				
				int addResult = calc.addition();
				System.out.println("Addition: "+addResult);
				
				int result = calc.subtraction();
				System.out.println("Subtraction: "+result);
				
			}
}
