package com.advancedjava.class12;

import java.util.Scanner;

//Single Inheritance

public class Father {
			
		String familyName;
		String address;
		String age;
		
		
		public void getFatherDetails() {
				Scanner details = new Scanner(System.in);
				System.out.println("Enter family name: ");
				familyName = details.next();
				
				System.out.println("Enter address: ");
				address = details.next();
				
				System.out.println("Enter father's age: ");
				age = details.next();
		}
		
		public void showFatherDetails() {
				System.out.println("Family Name: "+familyName+ " "+ "Address: "+address+ " "+ "Age: "+age);
		}
/*	
		public Father() {
		familyName = "Khatri";
		address = "Kathmandu";
		name = "Tek Khatri";
		} */
}
	

