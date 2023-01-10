package com.advancedjava.class12;

import java.util.Scanner;

public class Child extends Father {
				
				String childName;
				
	
	public Child() {
			
			childName = "Manoj";
			
			
	}
		public void showFatherDetails() {
			super.showFatherDetails();
			
			System.out.println("Enter Father First Name: ");
			Scanner scanner = new Scanner(System.in);
			String fatherFirstName = scanner.next();
			
			System.out.println("Father Name: "+fatherFirstName +" "+familyName);
		}
	
	
		public void showChildDetails() {
		System.out.println("I am "+childName+ " "+ familyName +" and I am from "+address);
			
	}
		public static void main(String[] args) {
				Child son = new Child();
				son.getFatherDetails();
				
				System.out.println("Child's Details :");
				son.showChildDetails();
				
				System.out.println("Father's Details :");
				son.showFatherDetails();
				
				
				
		}
	
}
