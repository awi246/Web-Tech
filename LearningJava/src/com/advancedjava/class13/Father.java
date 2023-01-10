package com.advancedjava.class13;

import java.util.Scanner;

public class Father  extends GrandFather{
				
		private String firstName;
		private int totalFamilyAmount;
		
		public void getFatherDetails() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Father firstName:");
			firstName = scanner.nextLine();
			
			System.out.println("Enter total FamilyAmount: ");
			totalFamilyAmount = scanner.nextInt();
		}
		
		public void showFamilyDetails() {
				super.showfamilyDetails();
				System.out.println("Father Details:");
				System.out.println("Name: "+firstName+ " "+super.familyName );
				System.out.println("Address: "+ super.address);
				System.out.println("Gender: "+ super.gender);
		}
		

		
}
